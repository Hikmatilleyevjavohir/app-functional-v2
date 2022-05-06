package extraTask.onlineTicket.controller;

import extraTask.onlineTicket.Main;
import extraTask.onlineTicket.dto.UserDto;
import extraTask.onlineTicket.model.*;
import extraTask.onlineTicket.service.OrderService;
import extraTask.onlineTicket.service.UserService;
import extraTask.onlineTicket.service.impl.OrderServiceImpl;
import extraTask.onlineTicket.service.impl.UserServiceImpl;

public class OrderController {
    private OrderService orderService = new OrderServiceImpl();

    public void buyTicket(Order[] orders, Ticket[] tickets, User[] users, UserDto userDto, TrainSchedule[] trainSchedules) {
        for (User user : users) {
            if (user.getLogin().equals(userDto.getLogin()) && user.getPassword().equals(userDto.getPassword())) {
                orderService.buyTicket(orders, tickets, trainSchedules, user);
            }
        }
    }

    public void showMyOrder(Order[] orders, UserDto userDto, User[] users) {
        boolean hasUser = false;
        for (User user : users) {
            if (user.getLogin().equals(userDto.getLogin()) && user.getPassword().equals(userDto.getPassword())) {
                hasUser = true;
                orderService.showMyOrders(orders, user);
            }
        }
        if (!hasUser)
            System.out.println(Main.messages[1].getMessage());
    }
}
