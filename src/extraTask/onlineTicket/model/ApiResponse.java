package extraTask.onlineTicket.model;

public class ApiResponse {
    private Message message;
    private boolean status;

    public ApiResponse(Message message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
