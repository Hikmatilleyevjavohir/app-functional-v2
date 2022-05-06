package extraTask.Republic.sevice.impl;

import extraTask.Republic.model.area.District;
import extraTask.Republic.model.user.DistrictKhokim;
import extraTask.Republic.sevice.DistrictKhokimService;
import extraTask.Republic.sevice.DistrictService;

import java.util.List;

public class DistrictKhokimServiceImpl implements DistrictKhokimService {

    @Override
    public void showDistrictKhokim(List<DistrictKhokim> districtKhokims, int districtId) {
        for (DistrictKhokim districtKhokim : districtKhokims) {
            if (districtKhokim.getDistrict().getId() == districtId + 1){
                System.out.println("\nInfo\n");
                System.out.println("-----------------------------------------------------");
                System.out.println("Area: " + districtKhokim.getDistrict().getName() + " | Area size: " + districtKhokim.getDistrict().getSize() + " | Area population: " + districtKhokim.getDistrict().getPopulation());
                System.out.println("President: " + districtKhokim.getFullName() + " | Address: " + districtKhokim.getAddress().getDistrict().getRegion().getName() + " region. " + districtKhokim.getAddress().getDistrict().getName() + " district");
                System.out.println("-----------------------------------------------------\n");
            }
        }
    }
}
