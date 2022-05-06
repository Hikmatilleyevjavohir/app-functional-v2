package extraTask.Republic.model.area;

public class Address {
    private String street;
    private District district;

    public Address(String street, District district) {
        this.street = street;
        this.district = district;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
