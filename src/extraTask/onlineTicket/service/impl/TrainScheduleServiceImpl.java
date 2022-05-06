package extraTask.onlineTicket.service.impl;

import extraTask.onlineTicket.model.Train;
import extraTask.onlineTicket.model.TrainSchedule;
import extraTask.onlineTicket.service.TrainScheduleService;

public class TrainScheduleServiceImpl implements TrainScheduleService {
    @Override
    public void trainArrival(TrainSchedule[] trainSchedules, String station) {
        System.out.println("Arrival: ");
        System.out.println("---------------------------------------------------------------");

        for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule.getFrom().equals(station))
                System.out.println(trainSchedule.getTrain().getTrainNo() + "  |  " + trainSchedule.getFrom() + "  |  " + trainSchedule.getTo());
        }

        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public void trainDeparture(TrainSchedule[] trainSchedules, String station) {
        System.out.println("---------------------------------------------------------------");

        for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule.getFrom().equals(station))
                System.out.println(trainSchedule.getTrain().getTrainNo() + "  |  " + trainSchedule.getTo() + "  |  " + trainSchedule.getFrom());
        }

        System.out.println("---------------------------------------------------------------");
    }
}
