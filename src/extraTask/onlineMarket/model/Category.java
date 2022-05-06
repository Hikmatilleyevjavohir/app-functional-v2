package extraTask.onlineMarket.model;

public class Category {
    private Long id;
    private String name;
    private String discription;

    public Category(Long id, String name, String discription) {
        this.id = id;
        this.name = name;
        this.discription = discription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}
