package extraTask.Republic.controller;

import extraTask.Republic.model.user.President;
import extraTask.Republic.sevice.PresidentService;
import extraTask.Republic.sevice.impl.PresidentServiceImpl;

import java.util.ArrayList;

public class PresidentController {
    private ArrayList<President> presidents = new ArrayList<>();
    private PresidentService presidentService = new PresidentServiceImpl();
    private AddresController addresController = new AddresController();

    public void showPresidentInfo(int republicId){
        addresController.allAddress();
        allPresident();
        presidentService.showPresidentInfo(presidents, republicId);
    }

    private void allPresident(){
        presidents.add(new President(1, "Shavkat", "Mirziyoyev", AddresController.addresses.get(0), RepublicController.republics.get(0)));
    }


}
