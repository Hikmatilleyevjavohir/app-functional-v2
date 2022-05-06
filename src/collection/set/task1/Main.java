package collection.set.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1-vazifa
 *
 * 1) Ichida String toifasidagi elementlarni saqlaydigan set yarating va ichiga 10 ta element kiriting
 * 2) Set barcha elementlarini iterator orqali ekranga chiqazing
 * 3) Set barcha elementlarini forEach methodi orqali ekranga chiqazing
 */
public class Main {
    public static void main(String[] args) {

//         1) Ichida String toifasidagi elementlarni saqlaydigan set yarating va ichiga 10 ta element kiriting

        Set<String> text = new HashSet<>();
        text.add("Tohir");
        text.add("Alish");
        text.add("Andu");
        text.add("John");
        text.add("Anna");
        text.add("Javo");
        text.add("None");
        text.add("All");
        text.add("Name");
        text.add("C#");

//        2) Set barcha elementlarini iterator orqali ekranga chiqazing

        Iterator<String> iterator = text.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

//        3) Set barcha elementlarini forEach methodi orqali ekranga chiqazing

        System.out.println("----------------------------------------");

        text.forEach(name -> System.out.println(name));
    }
}
