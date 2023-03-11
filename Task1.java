import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации (после перемещения числа) запишите в лог-файл.

public class Task1 {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();
        int[] arr = {10, 3, 1, 2, 0, 9, 15, 2};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                strB.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_file_sort.txt", false);
                    fw.write(strB.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("Что-то пошло не так");
                }  
            }
        }
    }
}