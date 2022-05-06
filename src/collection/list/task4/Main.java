package collection.list.task4;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 4-vazifa
 *
 * 1)  Elementlarini alfabet tartibida joylashtiruvchi Ismlarni saqlovchi
 * list yarating va uni 10 ta element bilan to’ldiring
 * 2)  Ismlar joylashgan listdan “A” harfidan boshlangan ismlarni o’chiring.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String name;
        System.out.println("Ismlarni Kiring: ");
        for (int i = 0; i < 10; i++){
            name = scanner.nextLine();
            if (i == 0)
                names.add(name);
            if (i == 1)
                names.add(name);
            else {
                names.add(name);
                names.sort((name1, name2) -> name1.compareTo(name2));
            }

        }

        for (String s : names) {
            System.out.println(s);
        }

//        2)  Ismlar joylashgan listdan “A” harfidan boshlangan ismlarni o’chiring.

        names.removeIf(n -> (n.startsWith("A")));

        System.out.println("---------------------------------");
        for (String s : names) {
            System.out.println(s);
        }
    }
}
