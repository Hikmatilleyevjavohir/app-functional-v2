package collection.list.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hamza Teacher, [4/26/2022 9:52 AM]
 * [Forwarded from Off Backend G1]
 * 1-vazifa
 * <p>
 * 1) Ichida double toifali radius fieldi bor Aylana (Circle) classini yarating.
 * 2) Circle objectlarini saqlovchi circles1 nomli list yarating va ichiga 5 ta element joylashtiring.
 * 3) Ichida Aylana toifasidagi elementlarini saqlovchi circles2 nomli list yarating
 * va unga circles1 ning elementlarini joylashtiring.
 */
public class Main {
    public static void main(String[] args) {
        List<Circle> circles1 = new ArrayList<>();

        circles1.add(new Circle(12.0));
        circles1.add(new Circle(13.0));
        circles1.add(new Circle(14.0));
        circles1.add(new Circle(15.0));
        circles1.add(new Circle(16.0));

        System.out.println(circles1);

        List<Circle> circles2 = new ArrayList<>();
        circles2.addAll(circles1);

        System.out.println(circles2);
    }
}
