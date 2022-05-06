package extraTask.onlineTicket.model;

public class TrainSchedule {
    private Integer id;
    private Train train;
    private String from;
    private String to;
    static int ticketCount;

    public TrainSchedule(Integer id, Train train, String from, String to) {
        this.id = id;
        this.train = train;
        this.from = from;
        this.to = to;
    }

    public TrainSchedule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public static int getTicketCount() {
        return ticketCount;
    }

    public static void setTicketCount(int ticketCount) {
        TrainSchedule.ticketCount = ticketCount;
    }
}
