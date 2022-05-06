package collection.set.task2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 2-vazifa
 *
 * 1) Elementlari butun sonlardan iborat va elementlarini kiritish tartibida saqlovchi set yarating.
 * 2) Set ga random qilish orqali qiymati 300 dan 500 gacha bo’lgan 100 ta son kiriting.
 * 3) Qiymati 400 dan katta bo’lgan elementlarini o’chiring.
 */
public class Main {
    public static void main(String[] args) {

//        1) Elementlari butun sonlardan iborat va elementlarini kiritish tartibida saqlovchi set yarating.

        Set<String> names = new LinkedHashSet<>();
        names.add("Abdug'ani");
        names.add("Jahongir");
        names.add("Hikmatillayev");
        names.add("Javohir");
        names.add("Karim");
        names.add("Abdulla");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

//        2) Set ga random qilish orqali qiymati 300 dan 500 gacha bo’lgan 100 ta son kiriting.

        System.out.println("--------------------------------------------------------------");

        Random random = new Random();
        Set<Integer> number = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++){
            int n = random.nextInt(500 - 300 + 1) + 300;
            number.add(n);
        }

        Iterator<Integer> iteratorNumber = number.iterator();
        while (iteratorNumber.hasNext()) {
            Integer next = iteratorNumber.next();
            System.out.println(next);
        }

//        3) Qiymati 400 dan katta bo’lgan elementlarini o’chiring.

        System.out.println("-----------------------------------------------------------------------");
        number.removeIf(m -> (m > 400));

        Iterator<Integer> iteratorNumber1 = number.iterator();
        while (iteratorNumber1.hasNext()) {
            Integer next = iteratorNumber1.next();
            System.out.println(next);
        }

    }
}
