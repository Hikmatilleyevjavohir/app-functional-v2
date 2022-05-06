package extraTask.onlineTicket.model;

public class Order {
    private Integer id;
    private Ticket ticketId;
    private User userId;

    public Order(Integer id, Ticket ticketId, User userId) {
        this.id = id;
        this.ticketId = ticketId;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ticket getTicketId() {
        return ticketId;
    }

    public void setTicketId(Ticket ticketId) {
        this.ticketId = ticketId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
