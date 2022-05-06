package alloftask.task8;

import java.util.Scanner;

/**
 * 8-vazifa
 *
 * Berilgan int toifasidagi massiv tub elementlarining yig’indisini hisoblovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        IsPrime isPrime = arrays -> {
            int sum = 0;
            for (int i = 0; i < arrays.length; i++) {
                if (!isPrime(arrays[i])){
                    sum += arrays[i];
                }
            }
            return sum;
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Please Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum of prime element massiv is " + isPrime.sum(arr));
    }

    private static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return true;
        }
        return false;
    }
}
