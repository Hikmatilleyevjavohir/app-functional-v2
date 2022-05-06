package collection.list.task3;

import java.util.*;
import java.util.function.Predicate;

/**
 *3-vazifa
 *
 * 1)  Rangi, modeli va davlat raqami fieldlari bor bo’lgan Car klassini yarating.
 *     Main classida Car classidan 10 ta bir xil bo’lmagan object oling.
 *     Ichida Car toifasidagi elementlarni saqlaydigan cars nomli List yarating
 *     va 10 ta elementni joylashtiring.
 *
 * 2)  Indexdan foydalangan holda cars elementlarini ekranga chiqazing
 *
 * 3)  List ichidan elementlarni random qilib oladigan method yozing.
 *
 * 4)  Uzunligi 5 ga teng bo’lgan, ichida Car toifasidagi elementlarni saqlaydigan
 *     cars1 nomli boshqa list yarating va uni ichini to’ldiring. cars1
 *     list elementlarini cars listning 2 indexidan boshlab joylashtiring
 *
 * 5)  cars listni model bo’yicha saralang
 *
 * 6)  cars listidan cars1 listida bor bo’lgan elementlarni o’chiring
 *
 * 7)  cars listidan cars1 listida yo’q bo’lgan elementlarni o’chiring
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("White", "Next", "Ab122");
        Car car2 = new Car("Black", "Spark", "Ac222");
        Car car3 = new Car("Blue", "Next2", "ABX777");
        Car car4 = new Car("Green", "Nex3", "B3283");
        Car car5 = new Car("Red", "Cobalt", "Ts21");
        Car car6 = new Car("Brown", "Nexia", "Da323");
        Car car7 = new Car("Pink", "Gentra", "3123");
        Car car8 = new Car("BluGreen", "Tico", "Gd33");
        Car car9 = new Car("Yellow", "Matiz", "A1313");
        Car car10 = new Car("White", "Coptiva", "777");

//        1)  Rangi, modeli va davlat raqami fieldlari bor bo’lgan Car klassini yarating.
//            Main classida Car classidan 10 ta bir xil bo’lmagan object oling.
//            Ichida Car toifasidagi elementlarni saqlaydigan cars nomli List yarating
//            va 10 ta elementni joylashtiring.
//
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
//        2)  Indexdan foydalangan holda cars elementlarini ekranga chiqazing

//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

//        3)  List ichidan elementlarni random qilib oladigan method yozing.
//        System.out.println("\n\n");
//        for (int i = 0; i < 10; i++){
//            System.out.println(getCarFromList(cars));
//        }

//        4)  Uzunligi 5 ga teng bo’lgan, ichida Car toifasidagi elementlarni saqlaydigan
//            cars1 nomli boshqa list yarating va uni ichini to’ldiring. cars1
//            list elementlarini cars listning 2 indexidan boshlab joylashtiring

        List<Car> cars1 = new ArrayList<>();
        cars1.add(new Car("White", "Next", "Ab122"));
        cars1.add(new Car("Blacdk", "Getra", "AB121"));
        cars1.add(new Car("BluGdreen", "Cobalt", "Gd33"));
        cars1.add(new Car("Greden", "Cobalt", "AC323"));
        cars1.add(new Car("Rded", "Cobalt", "Af333"));

//        cars.addAll(2, cars1);



//        5)  cars listni model bo’yicha saralang
//        cars.sort((c1, c2) -> c1.getModel().compareTo(c2.getModel()));
//        System.out.println("\n\n");
//        System.out.println(cars);

//        6)  cars listidan cars1 listida bor bo’lgan elementlarni o’chiring
//        for (Car cars1Item : cars1) {
//            cars.removeIf(carsItem -> (carsItem.equals(cars1Item)));
//        }
//        for (Car car : cars) {
//            System.out.println(car);
//        }

//        7)  cars listidan cars1 listida yo’q bo’lgan elementlarni o’chiring

        for (int i = cars.size() - 1; i >= 0; i--) {
            for (Car car : cars1) {
                if (cars.get(i).equals(car)) {
//                    cars.remove(i);
//                    break;
                    System.out.println(cars.get(i));
                    continue;
                }else{
                    cars.remove(car);
                    System.out.println("-----------------");
                    System.out.println(cars.get(i));
                    System.out.println("-----------------");
                    break;
                }
            }
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }

//    private static Car getCarFromList(List<Car> cars){
//        Random random = new Random();
//        return cars.get(random.nextInt(cars.size()));
//    }

}
