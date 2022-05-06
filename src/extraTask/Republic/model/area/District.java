package extraTask.Republic.model.area;

public class District extends Area{
    // Many To One
    private Region region;

    public District(int id, String name, double size, int population, Region region) {
        super(id, name, size, population);
        this.region = region;
    }

    public District(Region region) {
        this.region = region;
    }

    public District() {
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
