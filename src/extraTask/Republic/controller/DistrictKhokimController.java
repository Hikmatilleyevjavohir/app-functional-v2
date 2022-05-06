package extraTask.Republic.controller;

import extraTask.Republic.model.user.DistrictKhokim;
import extraTask.Republic.sevice.DistrictKhokimService;
import extraTask.Republic.sevice.impl.DistrictKhokimServiceImpl;

import java.util.ArrayList;

public class DistrictKhokimController {
    private ArrayList<DistrictKhokim> districtKhokims = new ArrayList<>();
    private DistrictKhokimService districtKhokimService = new DistrictKhokimServiceImpl();

    public void showDistrictKhokim(int districtId){
        allDistrictKhokim();
        districtKhokimService.showDistrictKhokim(districtKhokims, districtId);
    }

    private void allDistrictKhokim(){
        districtKhokims.add(new DistrictKhokim(1, "Ahliddin", "Nuriddinov", AddresController.addresses.get(2), DistrictController.districts.get(0)));
    }
}
