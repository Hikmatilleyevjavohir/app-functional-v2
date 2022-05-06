package alloftask.task2;

import java.util.Scanner;

/**
 * 2-vazifa
 * Ikkita sonning kattasini aniqlovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Max max = (a, b) -> Math.max(a, b);

        System.out.println(" Ikki soni kiriting: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("ikki sonning max: " + max.max(n, m));
    }
}
