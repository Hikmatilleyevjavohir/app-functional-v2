package extraTask.OnlineAnnouncementSystem;

import extraTask.OnlineAnnouncementSystem.controller.AnnouncementController;
import extraTask.OnlineAnnouncementSystem.controller.MessageController;
import extraTask.OnlineAnnouncementSystem.controller.UserController;
import extraTask.OnlineAnnouncementSystem.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static UserController userController = new UserController();
    private static Scanner scanner = new Scanner(System.in);
    public static List<Category> categories = new ArrayList<>();
    private static AnnouncementController announcementController = new AnnouncementController();
    private static MessageController messageController = new MessageController();

    public static void main(String[] args) {
        categories.add(new Category(1, "Transport"));
        categories.add(new Category(2, "Bolalar dunyosi"));
        categories.add(new Category(3, "Elektronika"));
        categories.add(new Category(4, "Televizor", categories.get(2)));
        categories.add(new Category(5, "Telefon", categories.get(2)));


        int operationNumber;
        while (true){
            showOperation();
            operationNumber = scanner.nextInt();
            switch (operationNumber){
                case 1:
                    userController.signIn();
                    onlineAnnouncement();
                    break;
                case 2:
                    userController.signUp();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Siz no'to'g'ri son kiritdingiz! ");
            }
        }
    }

    private static void showOperation(){
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");
    }

    private static void onlineAnnouncement(){
        while (true){
            showOnlineAnnouncement();
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    announcementController.addAnnouncement();
                    break;
                case 2:
                    announcementController.viewAllAnnouncement();
                    break;
                case 3:
                    announcementController.showMyAnnouncement();
                    break;
                case 4:
                    messageController.writeMessage();
                    break;
                case 5:
                    messageController.inbox();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Siz mumkin bo'lmagan son kiritdingiz!  ");
                    break;
            }
        }
    }

    private static void showOnlineAnnouncement(){
        System.out.println("\nChoose the operation: ");
        System.out.println("1. Add announcement");
        System.out.println("2. View announcements");
        System.out.println("3. My announcements");
        System.out.println("4. Write message");
        System.out.println("5. Inbox");
        System.out.println("6. Log out");
    }
}
