package extraTask.Republic.controller;

import extraTask.Republic.model.area.District;
import extraTask.Republic.sevice.DistrictService;
import extraTask.Republic.sevice.impl.DistrictServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DistrictController {
    public static List<District> districts = new ArrayList<>();
    private RegionController regionController = new RegionController();
    private DistrictService districtService = new DistrictServiceImpl();

    public int showDistrict(int regionId){
       return districtService.showDistrict(districts, regionId);
    }

    public void allDistrict(){
        regionController.allRegion();
        districts.add(new District(1, "POP", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(2, "Chust", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(3, "To'raqo'rg'on", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(4, "Norin", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(5, "Chortoq", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(6, "Uychi", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(7, "Namangan", 122112.0, 21212, RegionController.regions.get(0)));
        districts.add(new District(8, "Zomin", 122112.0, 21212, RegionController.regions.get(4)));
    }
}
