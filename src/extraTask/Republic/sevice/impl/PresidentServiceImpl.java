package extraTask.Republic.sevice.impl;

import extraTask.Republic.model.user.President;
import extraTask.Republic.sevice.PresidentService;

import java.util.List;

public class PresidentServiceImpl implements PresidentService {

    @Override
    public void showPresidentInfo(List<President> presidents, int republicId) {
        for (President president : presidents) {
            if (president.getRepublic().getId() == republicId + 1){
                System.out.println("\nInfo\n");
                System.out.println("-----------------------------------------------------");
                System.out.println("Area: " + president.getRepublic().getName() + " | Area size: " + president.getRepublic().getSize() + " | Area population: " + president.getRepublic().getPopulation());
                System.out.println("President: " + president.getFullName() + " | Address: " + president.getAddress().getDistrict().getRegion().getName() + " region. " + president.getAddress().getDistrict().getName() + " district");
                System.out.println("-----------------------------------------------------\n");
            }
        }
    }
}
