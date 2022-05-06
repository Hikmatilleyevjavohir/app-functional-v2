package alloftask.task3;

import java.util.Scanner;

/**
 * 3-vazifa
 *
 * Berilgan int toifali massivning eng katta elementini topuvchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Max max = arrays -> {
            if (arrays.length != 0){
                int maxOfArray = arrays[0];
                for (int i = 1; i < arrays.length; i++) {
                    maxOfArray = Math.max(maxOfArray, arrays[i]);
                }
                return maxOfArray;
            }
            else
                return -1;
        };

        System.out.println("Massiv O'lchamini kiriting: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println(" Please Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("the biggest Element of Array is " + max.max(arr));
    }
}
