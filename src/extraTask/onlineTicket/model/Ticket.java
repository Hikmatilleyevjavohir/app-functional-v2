package extraTask.onlineTicket.model;

public class Ticket {
    private Integer ticketNo;
    private String departureStation;
    private String destantionstation;
    private Integer classCategory;
    private double price;
    private Train train;

    public Ticket(Integer ticketNo, String departureStation, String destantionstation, Integer classCategory, double price, Train train) {
        this.ticketNo = ticketNo;
        this.departureStation = departureStation;
        this.destantionstation = destantionstation;
        this.classCategory = classCategory;
        this.price = price;
        this.train = train;
    }

    public Ticket() {
    }

    public Integer getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(Integer ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDestantionstation() {
        return destantionstation;
    }

    public void setDestantionstation(String destantionstation) {
        this.destantionstation = destantionstation;
    }

    public Integer getClassCategory() {
        return classCategory;
    }

    public void setClassCategory(Integer classCategory) {
        this.classCategory = classCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
