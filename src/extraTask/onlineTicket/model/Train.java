package extraTask.onlineTicket.model;

public class Train {
    private Integer id;
    private String trainNo;
    private Integer seatCount;

    public Train(Integer id, String trainNo, Integer seatCount) {
        this.id = id;
        this.trainNo = trainNo;
        this.seatCount = seatCount;
    }

    public Train() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", trainNo='" + trainNo + '\'' +
                ", seatCount=" + seatCount +
                '}';
    }
}
