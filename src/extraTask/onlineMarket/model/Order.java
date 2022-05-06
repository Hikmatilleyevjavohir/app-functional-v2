package extraTask.onlineMarket.model;

import extraTask.onlineMarket.model.enums.OrderStatus;

public class Order {
    private Long id;
    private User custmer;

    /**
     * true buyurtma muvaffaqiyatli jo'natildi
     */
    private OrderStatus orderStatus;
    private Double totalPrice;

    public Order(Long id, User custmer, OrderStatus orderStatus, Double totalPrice) {
        this.id = id;
        this.custmer = custmer;
        this.orderStatus = orderStatus;
        this.totalPrice = totalPrice;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCustmer() {
        return custmer;
    }

    public void setCustmer(User custmer) {
        this.custmer = custmer;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", custmer=" + custmer +
                ", orderStatus=" + orderStatus +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
