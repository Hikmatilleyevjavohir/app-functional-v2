package extraTask.OnlineAnnouncementSystem.model;

public class Announcement {
    private Integer id;
    private String title;
    private Category category;
    private String body;
    private double cost;
    private User user;

    public Announcement(Integer id, String title, Category category, String body, double cost, User user) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.body = body;
        this.cost = cost;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
