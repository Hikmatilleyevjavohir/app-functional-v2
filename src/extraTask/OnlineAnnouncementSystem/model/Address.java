package extraTask.OnlineAnnouncementSystem.model;

public class Address {
    private int id;
    private String region;
    private String district;

    public Address(int id, String region, String district) {
        this.id = id;
        this.region = region;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
