package collection.list.task5;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hamza Teacher, [4/26/2022 9:52 AM]
 * [Forwarded from Off Backend G1]
 * 5-vazifa
 *
 * Butun sonlarni kiritish tartibida saqlovchi uzunligi 50 ga teng bo’lgan numbers listini yarating.
 * Ichini 1 dan 100 gacha bo’lgan sonlarni random qilib to’ldiring.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100));
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
