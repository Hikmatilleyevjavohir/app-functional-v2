package extraTask.Republic.sevice.impl;

import extraTask.Republic.model.area.Republic;
import extraTask.Republic.sevice.RepublicService;

import java.util.List;
import java.util.Scanner;

public class RepublicServiceImpl implements RepublicService {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public int showRepublic(List<Republic> republics) {
        System.out.println("Choose the republic ");
        for (int i = 0; i < republics.size(); i++){
            System.out.println(i+1 + ". " + republics.get(i).getName());
        }

        int republicId = scanner.nextInt();
        return republicId-1;
    }
}
