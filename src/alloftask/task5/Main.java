package alloftask.task5;

import java.util.Scanner;

/**
 * 5-vazifa
 *
 * Berilgan int toifali massiv elementlarining yig’indisini hisoblovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sum sum = arrays -> {
            int sumOfArrayElement = 0;
            for (int i = 0; i < arrays.length; i++) {
                sumOfArrayElement += arrays[i];
            }
            return sumOfArrayElement;
        };

        System.out.println("Enter size of arrays: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Please Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum of All array element is " + sum.sum(arr));
    }
}
