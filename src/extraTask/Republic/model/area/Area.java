package extraTask.Republic.model.area;

public abstract class Area {
    private int id;
    private String name;
    private double size;
    private int population;   // kv /m

    public Area(int id, String name, double size, int population) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.population = population;
    }

    public Area() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Area: " + name + " | " +
                "Area size: " + size + " | " +
                "Area Population: " + population +
                "\n";
    }
}
