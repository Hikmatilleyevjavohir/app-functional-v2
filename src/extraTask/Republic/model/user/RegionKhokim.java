package extraTask.Republic.model.user;

import extraTask.Republic.model.area.Address;
import extraTask.Republic.model.area.Region;

public class RegionKhokim extends Person{
    private Region region;

    public RegionKhokim(Region region) {
        this.region = region;
    }

    public RegionKhokim(Integer id, String firstname, String lastname, Address address, Region region) {
        super(id, firstname, lastname, address);
        this.region = region;
    }

    public RegionKhokim() {
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
