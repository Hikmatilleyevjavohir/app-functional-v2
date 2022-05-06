package extraTask.onlineTicket.model;

public class Message {
    private Integer id;
    private String message;
    private String code;

    public Message(Integer id, String message, String code) {
        this.id = id;
        this.message = message;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
