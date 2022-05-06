package extraTask.Republic.sevice.impl;

import extraTask.Republic.model.user.RegionKhokim;
import extraTask.Republic.sevice.RegionKhokimService;


import java.util.List;

public class RegionKhokimServiceImpl implements RegionKhokimService {
    @Override
    public void showKhokinInfo(List<RegionKhokim> regionKhokims, int regionId) {
        for (RegionKhokim regionKhokim : regionKhokims) {
            if (regionKhokim.getRegion().getId() == regionId + 1){
                System.out.println("\nInfo\n");
                System.out.println("---------------------------------------------");
                System.out.println("Area: " + regionKhokim.getRegion().getName() + " | Area size: " + regionKhokim.getRegion().getSize() + " | Area population: " + regionKhokim.getRegion().getPopulation());
                System.out.println("President: " + regionKhokim.getFullName() + " | Address: " + regionKhokim.getAddress().getDistrict().getRegion().getName() + " region. " + regionKhokim.getAddress().getDistrict().getName() + " district");
                System.out.println("---------------------------------------------\n");
            }
        }
    }
}
