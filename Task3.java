import java.io.FileWriter;
import java.util.Scanner;

// *(дополнительно). К калькулятору из предыдущего дз добавить логирование.

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter integer first number: ");
        int num_1 = iScanner.nextInt();
        System.out.print("Enter one of the following arithmetic characters +, -, / or * : ");
        char sign = iScanner.next().charAt(0);
        System.out.print("Enter integer second number: ");
        int num_2 = iScanner.nextInt();
        int result = 0;
        switch (sign) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                result = num_1 / num_2;
                break;
        }
        System.out.printf("%s %s %s = %s", num_1, sign, num_2, result);
        iScanner.close();

        StringBuilder strB = new StringBuilder();
        strB.append(num_1).append(sign).append(num_2).append("=").append(result).append("\n");

        try {
            FileWriter fw = new FileWriter("log_file_calc.txt", true);
            fw.write(strB.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    } 
}