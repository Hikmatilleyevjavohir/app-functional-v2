package extraTask.Republic.model.area;

public class Region extends Area{
    // ManyToOne
    private Republic republic;

    public Region(int id, String name, double size, int population, Republic republic) {
        super(id, name, size, population);
        this.republic = republic;
    }

    public Region(Republic republic) {
        this.republic = republic;
    }

    public Region() {
    }

    public Republic getRepublic() {
        return republic;
    }

    public void setRepublic(Republic republic) {
        this.republic = republic;
    }
}
