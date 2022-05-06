package alloftask.task6;

import java.util.Scanner;

/**
 * 6-vazifa
 * Berilgan int toifali massiv musbat elementlarining yig’indisini hisoblovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SumOnlyMusbat sumOnlyMusbat = arrays -> {
           int sum = 0;
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i] > 0){
                    sum += arrays[i];
                }
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

        System.out.println("Sum of positive array element is " + sumOnlyMusbat.sum(arr));
    }
}
