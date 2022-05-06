package extraTask.OnlineAnnouncementSystem.model;

public class Category {
    private Integer id;
    private String name;
    private Category subcategory;

    public Category(Integer id, String name, Category subcategory) {
        this.id = id;
        this.name = name;
        this.subcategory = subcategory;
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Category subcategory) {
        this.subcategory = subcategory;
    }
}
