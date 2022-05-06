package extraTask.onlineMarket;

import extraTask.onlineMarket.model.*;
import org.w3c.dom.ls.LSInput;

import java.util.*;

public class OnlineMarketDemo {
    public static Scanner scanner = new Scanner(System.in);

    static Set<User> users;
    static List<Category> categories;
    static HashMap<Integer, Product> products;
    static List<Order> orders;
    static List<OrderDetails> orderDetails;
    static List<ShoppingCart> shoppingCarts;
    static LinkedHashMap<Product, Integer> tempMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        int choice = -1;
        do {
            showMainMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Incorrect Number");
                    break;
            }

        }while (choice != 0);
    }

    private static void showMainMenu() {

    }
}
