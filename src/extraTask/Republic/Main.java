package extraTask.Republic;

import extraTask.Republic.controller.*;
import extraTask.Republic.sevice.RegionService;

public class Main {
    private static RepublicController republicController = new RepublicController();
    private static PresidentController presidentController = new PresidentController();
    private static RegionController regionController = new RegionController();
    private static RegionKhokimController regionKhokimController = new RegionKhokimController();
    private static DistrictController districtController = new DistrictController();
    private static DistrictKhokimController districtKhokimController = new DistrictKhokimController();

    public static void main(String[] args) {

        int republicId = republicController.showRepublic();
        presidentController.showPresidentInfo(republicId);

        int regionId = regionController.showRegion(republicId);
        regionKhokimController.showKhokimInfo(regionId);

        int districtId = districtController.showDistrict(regionId);
        districtKhokimController.showDistrictKhokim(districtId);
    }

}

