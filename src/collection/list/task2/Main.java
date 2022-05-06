package collection.list.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 2-vazifa
 *
 * 1)  List yarating va unga 10 ta ism kiriting.
 * List elementlarini Iterator orqali ekranga chiqazing.
 * 2)  Listning oxiriga “Xolmat” ismini kiriting
 * 3)  Listning birinchi elementiga O’zingizni ismingizni kiriting.
 * 4)  Listning 2 elementini Familiyangizga almashtiring
 * 5)  Listni Array ga o’giring.
 * 6)  Listni ichidan ozingizni Ismingiz va Failiyangizni o’chiring
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Alisher");
        names.add("Ahliddin");
        names.add("Yusuf");
        names.add("Tohir");
        names.add("Mamurjon");
        names.add("Shahriyor");
        names.add("Abdulla");
        names.add("Abbos");
        names.add("Temur");
        names.add("Botir");

//        1)  List yarating va unga 10 ta ism kiriting.
//            List elementlarini Iterator orqali ekranga chiqazing.

        Iterator<String> iteratorNames = names.iterator();
        while (iteratorNames.hasNext()) {
            System.out.println(iteratorNames.next());
        }


//        2)  Listning oxiriga “Xolmat” ismini kiriting
        names.add("Xolmat");

//        3)  Listning birinchi elementiga O’zingizni ismingizni kiriting.

        names.set(0, "Javohir");

        System.out.println(names);

//        4)  Listning 2 elementini Familiyangizga almashtiring

        names.set(1, "Hikmatillayev");

//        5)  Listni Array ga o’giring.

        names.toArray();
        for (String name : names) {
            System.out.println(name);
        }

//        6)  Listni ichidan ozingizni Ismingiz va Failiyangizni o’chiring
        names.removeIf(name -> (name.equals("Javohir") || name.equals("Hikmatillayev")));
        System.out.println(names);

    }
}
