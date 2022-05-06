package extraTask.Republic.controller;

import extraTask.Republic.model.area.Address;

import java.util.ArrayList;
import java.util.List;

public class AddresController {
    public static List<Address> addresses = new ArrayList<>();
    private DistrictController districtController = new DistrictController();

    public void allAddress(){
        districtController.allDistrict();
        addresses.add(new Address("Navro'z ko'cha", DistrictController.districts.get(7)));
        addresses.add(new Address("Alisher ko'cha", DistrictController.districts.get(2)));
        addresses.add(new Address("Amir Temur ko'cha", DistrictController.districts.get(5)));
    }

}
