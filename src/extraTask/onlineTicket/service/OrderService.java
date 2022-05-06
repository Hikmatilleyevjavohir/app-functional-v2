package extraTask.onlineTicket.service;

import extraTask.onlineTicket.model.*;

public interface OrderService {
    void buyTicket(Order[] orders, Ticket[] tickets, TrainSchedule[] trainSchedules, User user);

    void showMyOrders(Order[] orders, User user);
}
