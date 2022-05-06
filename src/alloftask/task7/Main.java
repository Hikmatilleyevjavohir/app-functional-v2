package alloftask.task7;

import java.util.Scanner;

/**
 * Hamza Teacher, [4/22/2022 11:49 AM]
 * [Forwarded from Off Backend G1]
 * 7-vazifa
 *
 * Berilgan int toifasidagi massiv toq elementlarining yig’indisini hisoblovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfOddElementArray sumOfOddElementArray = arrays -> {
            int sum = 0;
            for (int i = 0; i < arrays.length; i += 2) {
                sum += arrays[i];
            }
            return sum;
        };

        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Please Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum of odd element array is " + sumOfOddElementArray.sum(arr));
    }
}
