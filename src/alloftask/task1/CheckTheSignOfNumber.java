package alloftask.task1;

import java.util.Scanner;

/**
 * 1-vazifa
 *
 * Berilgan sonning ishorasini aniqlovchi lamda expression yarating.
 */
public class CheckTheSignOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Sign sign = n -> {
            if (n > 0)
                return "Musbat";
            if (n == 0)
                return "neither positive and nagative";
            else
                return "Manfiy";
        };

        System.out.println(sign.checkSign(m));
    }
}
