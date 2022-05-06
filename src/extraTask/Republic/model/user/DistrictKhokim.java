package extraTask.Republic.model.user;

import extraTask.Republic.model.area.Address;
import extraTask.Republic.model.area.District;

public class DistrictKhokim extends Person{
    private District district;

    public DistrictKhokim(District district) {
        this.district = district;
    }

    public DistrictKhokim(Integer id, String firstname, String lastname, Address address, District district) {
        super(id, firstname, lastname, address);
        this.district = district;
    }

    public DistrictKhokim() {
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
