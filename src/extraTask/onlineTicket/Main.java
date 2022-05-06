package extraTask.onlineTicket;

import extraTask.onlineTicket.controller.OrderController;
import extraTask.onlineTicket.controller.TrainScheduleController;
import extraTask.onlineTicket.controller.UserController;
import extraTask.onlineTicket.dto.UserDto;
import extraTask.onlineTicket.model.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static UserController userController = new UserController();
    public static Message[] messages = new Message[10];
    private static TrainScheduleController trainScheduleController = new TrainScheduleController();
    private static OrderController orderController = new OrderController();

    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User(1, "Hikmatillayev", "Javohir", "Java", "root1234",
                "Passport", "Ab12121");
        users[1] = new User(2, "Nuriddinov", "Ahliddin", "Ahliddin", "root1234",
                "Passport", "Ab12121");
        users[2] = new User(3, "Abdukarim", "Karim", "karim", "root1234",
                "Passport", "Ab12121");

        Train[] trains = new Train[5];
        trains[0] = new Train(1, "ASNS12", 21);
        trains[1] = new Train(2, "ACNS12", 24);
        trains[2] = new Train(3, "ADNS12", 22);
        trains[3] = new Train(4, "AGNS12", 214);
        trains[4] = new Train(5, "ABNS12", 25);

        Ticket[] tickets = new Ticket[5];
        tickets[0] = new Ticket(1122, "NAMANGAN", "QO'QON", 1, 100.0, trains[0]);
        tickets[1] = new Ticket(1123, "QO'QON", "NAMANGAN", 2, 105.0, trains[1]);
        tickets[2] = new Ticket(1121, "OLMOS", "CHUST", 3, 140.0, trains[2]);
        tickets[3] = new Ticket(1120, "ANDIJON", "TO'RAQO'RG'ON", 4, 103.0, trains[3]);
        tickets[4] = new Ticket(1124, "QO'SHMINOR", "ANDIJON", 5, 107.0, trains[4]);

        TrainSchedule[] trainSchedules = new TrainSchedule[5];
        trainSchedules[0] = new TrainSchedule(1, trains[0], "QO'QON", "NAMANGAN");
        trainSchedules[1] = new TrainSchedule(2, trains[1], "NAMANGAN", "QO'QON");
        trainSchedules[2] = new TrainSchedule(3, trains[2], "OLMOS", "CHUST");
        trainSchedules[3] = new TrainSchedule(4, trains[3], "ANDIJON", "TO'RAQO'RG'ON");
        trainSchedules[4] = new TrainSchedule(5, trains[4], "QO'SHMINOR", "ANDIJON");

        Order[] orders = new Order[5];



        messages[0] = new Message(1, " Welcome to e-ticket System!", "1");
        messages[1] = new Message(2, "Sorry Login or password is incorrect! ", "2");
        messages[2] = new Message(3, "Password is changed successfully!", "3");
        messages[3] = new Message(4, "User Not found", "4");
        messages[4] = new Message(5, "Bunday yo'nalishda Poyezd yo'q!!", "5");
        messages[5] = new Message(6, "Number you entered is Incorrect!", "6");
        messages[6] = new Message(7, "Amaliyot rad etildi ", "7");
        messages[7] = new Message(8, "Successfully!!! ", "8");

        UserDto userDto = userController.signIn(users);
        int operationNumber;

        while (true){
            showOperation();
            operationNumber = scanner.nextInt();
            switch (operationNumber){
                case 1:
                    trainScheduleController.TrainScheduleControl(trainSchedules);
                    break;
                case 2:
                    orderController.buyTicket(orders, tickets, users, userDto,trainSchedules);
                    break;
                case 3:
                    orderController.showMyOrder(orders, userDto, users);
                    break;
                case 4:
                    userController.showPersonalData(users, userDto);
                    break;
                case 5:
                    userController.changePassword(users);
                    break;
                case 6:
                    System.out.println("Thank you for attention! ");
                    System.exit(0);
                default:
                    System.out.println("Siz mumkin bo'lmagan son kiritdingiz! ");
                    break;
            }
        }

    }

    private static void showOperation(){
        System.out.println("\nChoose the Operation");
        System.out.println("1. Train Schedule");
        System.out.println("2. Buy Ticket");
        System.out.println("3. My orders");
        System.out.println("4. Personal data");
        System.out.println("5. Change Password");
        System.out.println("6. Log out");
    }
}
