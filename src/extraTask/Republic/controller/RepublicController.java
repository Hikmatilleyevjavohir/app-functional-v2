package extraTask.Republic.controller;

import extraTask.Republic.model.area.Republic;
import extraTask.Republic.sevice.RepublicService;
import extraTask.Republic.sevice.impl.RepublicServiceImpl;

import java.util.ArrayList;

public class RepublicController {
    private RepublicService republicService = new RepublicServiceImpl();
    public static ArrayList<Republic> republics = new ArrayList<>();

    public int showRepublic(){
        republicList();
        return republicService.showRepublic(republics);
    }

    private void republicList(){
        republics.add(new Republic(1, "UZBEKISTAN", 242.0, 12534342));
        republics.add(new Republic(2, "TOJIGISTON", 223.0, 1234342));
        republics.add(new Republic(3, "AFG'ONISTON", 2421.0, 125342));
        republics.add(new Republic(4, "TURKMANISTON", 2422.0, 1253342));
        republics.add(new Republic(5, "AQSH", 24222.0, 1253433342));
    }
}
