package extraTask.onlineTicket.controller;

import extraTask.onlineTicket.model.TrainSchedule;
import extraTask.onlineTicket.service.TrainScheduleService;
import extraTask.onlineTicket.service.impl.TrainScheduleServiceImpl;

import java.util.Scanner;

public class TrainScheduleController {
    private TrainScheduleService trainScheduleService = new TrainScheduleServiceImpl();

    public void TrainScheduleControl(TrainSchedule[] trainSchedules){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a Station: ");
        String station = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        int operationNumber;

        for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule.getFrom().equals(station)){
                while (true){
                    showOperation();
                    operationNumber = scanner1.nextInt();
                    switch (operationNumber){
                        case 1:
                            trainScheduleService.trainArrival(trainSchedules, station);
                            break;
                        case 2:
                            trainScheduleService.trainDeparture(trainSchedules, station);
                            break;
                        case 3:
                            return;
                        default:
                            System.out.println("You entered the number which is incorrect! ");
                            break;
                    }
                }
            }
        }

    }

    public void showOperation(){
        System.out.println("1 - Arrival  2 - Departure  3 - exit");
    }
}
