package alloftask.task9;

import java.util.Scanner;
import java.util.stream.StreamSupport;

/**
 * 9-vazifa
 *
 * Berilgan s1 matnda s2 matn bor yo’qligini aniqlovchi lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        CheckText checkText = (text1, text2) -> text1.contains(text2);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text1: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter Text2: ");
        String text2 = scanner.nextLine();

        if (checkText.checkText(text1, text2))
            System.out.println("Text1 contains Text2");
        else
            System.out.println("Text1 doesn't contain Text2");
    }
}
