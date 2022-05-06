package extraTask.Republic.sevice.impl;

import extraTask.Republic.model.area.Region;
import extraTask.Republic.sevice.RegionService;

import java.util.List;
import java.util.Scanner;


public class RegionServiceImpl implements RegionService {
    private static int index = 1;
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public int showRegion(List<Region> regions, int republicId) {
        for (Region region : regions) {
            if (region.getRepublic().getId() == republicId + 1){
                System.out.println(index++ + ". " + region.getName());
            }
        }
        int regionId = scanner.nextInt();
        return regionId - 1;
    }
}
