package extraTask.OnlineAnnouncementSystem.model;

public class Message {
    private int id;
    private String title;
    private String body;
    private Announcement announcement;
    private User fromUser;
    private User toUser;

    public Message(int id, String title, String message, Announcement announcement, User fromUser, User toUser) {
        this.id = id;
        this.title = title;
        this.body = message;
        this.announcement = announcement;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }
}
