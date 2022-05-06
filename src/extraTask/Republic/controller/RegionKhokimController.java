package extraTask.Republic.controller;

import extraTask.Republic.model.user.RegionKhokim;
import extraTask.Republic.sevice.RegionKhokimService;
import extraTask.Republic.sevice.RegionService;
import extraTask.Republic.sevice.impl.RegionKhokimServiceImpl;
import extraTask.Republic.sevice.impl.RegionServiceImpl;

import java.util.ArrayList;

public class RegionKhokimController {
    private ArrayList<RegionKhokim> regionKhokims = new ArrayList<>();
    private RegionKhokimService regionKhokimService = new RegionKhokimServiceImpl();

    public void showKhokimInfo(int regionId){
        allRegionKhokim();
        regionKhokimService.showKhokinInfo(regionKhokims, regionId);
    }

    private void allRegionKhokim(){
        regionKhokims.add(new RegionKhokim(1, "Javohir", "Hikmatillayev", AddresController.addresses.get(1), RegionController.regions.get(0)));
    }
}
