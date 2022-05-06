package extraTask.Republic.controller;

import extraTask.Republic.model.area.Region;
import extraTask.Republic.sevice.RegionService;
import extraTask.Republic.sevice.impl.RegionServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class RegionController {
    public static List<Region> regions = new ArrayList<>();
    private RegionService regionService = new RegionServiceImpl();

    public int showRegion(int republicId){
        return regionService.showRegion(regions, republicId);
    }

    public void allRegion(){
        regions.add(new Region(1, "Namangan", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(2, "Andijon", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(3, "Farg'ona", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(4, "Toshkent", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(5, "Jizzax", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(6, "Sirdaryo", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(7, "Buxoro", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(8, "Navoiy", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(9, "Qashqadaryo", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(10, "Surxondaryo", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(11, "Xorazm", 122.0, 124434, RepublicController.republics.get(0)));
        regions.add(new Region(12, "Xiva", 122.0, 124434, RepublicController.republics.get(0)));

    }

}
