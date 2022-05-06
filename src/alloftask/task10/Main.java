package alloftask.task10;

import java.util.Scanner;

/**
 * Hamza Teacher, [4/22/2022 11:49 AM]
 * [Forwarded from Off Backend G1]
 * 10-vazifa
 * <p>
 * Ingliz tilida berilgan  matn ichida nechta unli harf borligini aniqlaydigan  lamda expression yarating.
 */
public class Main {
    public static void main(String[] args) {
        CountAmountVowel countAmountVowel = text -> {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                char a = text.charAt(i);
                if (a == 'a' || a == 'e' || a == 'i' || a == 'u' || a == 'o' ||
                    a == 'A' || a == 'E' || a == 'I' || a == 'U' || a == 'O')
                    count++;
            }
            return count;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the text: ");
        String text = scanner.nextLine();

        System.out.println("the amount of vowel in the text: " + countAmountVowel.count(text));
    }
}
