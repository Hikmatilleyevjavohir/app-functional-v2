package alloftask.task4;

import java.util.Scanner;

/**
 * 4-vazifa
 *
 * Berilgan massivda berilgan son bor yo’qligini aniqlovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {

        HasGivenNumber hasGivenNumber = (arrays, number) -> {
            boolean hasNumber = false;
            for (int i = 0; i < arrays.length; i++) {
                 if (number == arrays[i])
                     hasNumber = true;
            }
            return hasNumber;
        };

        System.out.println("Massiv O'lchamini kiriting: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println(" Please Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Please Enter the number that need to search: ");
        int number = scanner.nextInt();

        if (hasGivenNumber.hasGivenNumber(arr, number))
            System.out.println("the number that you entered is exist!");
        else
            System.out.println("Sorry it isn't exist! ");
    }
}
