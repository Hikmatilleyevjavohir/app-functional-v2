package extraTask.Republic.sevice.impl;

import extraTask.Republic.model.area.District;
import extraTask.Republic.sevice.DistrictService;

import java.util.List;
import java.util.Scanner;

public class DistrictServiceImpl implements DistrictService {
    private static int index = 1;
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public int showDistrict(List<District> districts, int regionId) {
        for (District district : districts) {
            if (district.getRegion().getId() == regionId + 1){
                System.out.println(index++ + ". " + district.getName());
            }
        }
        int districtNumber = scanner.nextInt();
        return districtNumber - 1;
    }
}
