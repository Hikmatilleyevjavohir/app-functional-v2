package extraTask.onlineTicket.service.impl;

import extraTask.onlineTicket.Main;
import extraTask.onlineTicket.model.*;
import extraTask.onlineTicket.service.OrderService;

import java.util.Scanner;

public class OrderServiceImpl implements OrderService {
    private static int index = 0;

    @Override
    public void buyTicket(Order[] orders, Ticket[] tickets, TrainSchedule[] trainSchedules, User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("From: ");
        String fromStation = scanner.nextLine();
        for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule.getFrom().equals(fromStation)){
                System.out.println("---------------------------------------");
                for (Ticket ticket : tickets) {
                    if (ticket.getTrain().equals(trainSchedule.getTrain())){
                        System.out.println(ticket.getTrain().getTrainNo() +  "    " + ticket.getDepartureStation() + "   " + ticket.getDestantionstation());
                    }
                }
                System.out.println("---------------------------------------");
                System.out.print("To: ");
                String toStation = scanner.nextLine();
                if (trainSchedule.getTo().equals(toStation)){
                    System.out.println("-----------------------------------------");
                    Ticket ticket1 = new Ticket();
                    for (Ticket ticket : tickets) {
                        if (ticket.getTrain().equals(trainSchedule.getTrain())){
                            ticket1 = ticket;
                            System.out.println(ticket.getTicketNo() +  "    " + ticket.getDepartureStation() + "----" + ticket.getDestantionstation() + "  " + ticket.getClassCategory() + " class   " + ticket.getPrice() + " so'm");
                        }
                    }
                    System.out.println("-----------------------------------------\n");
                    System.out.println("Do you buy ticket? 1-Yes, 2-No");
                    int number = scanner.nextInt();
                    switch (number){
                        case 1:
                            orders[index++] = new Order(index, ticket1, user);
                            System.out.println(Main.messages[7].getMessage() + "\n");
                            break;
                        case 2:
                            System.out.println(Main.messages[6].getMessage());
                            break;
                        default:
                            System.out.println(Main.messages[5].getMessage());
                            break;
                    }

                    return;
                }
                System.out.println(Main.messages[4].getMessage());
                return;
            }
        }
        System.out.println(Main.messages[4].getMessage());

    }

    @Override
    public void showMyOrders(Order[] orders, User user) {
        System.out.println("My orders ");
        System.out.println("---------------------------------------------------------");

        for (Order order : orders) {
            if (order != null){
                if (order.getUserId().equals(user))
                    System.out.println(order.getId() + " | " + order.getTicketId().getTicketNo() + " | " + order.getTicketId().getDepartureStation() + " --- " + order.getTicketId().getDestantionstation());
            }
        }

        System.out.println("----------------------------------------------------------");
    }
}
