package extraTask.onlineTicket.service;

import extraTask.onlineTicket.model.TrainSchedule;

public interface TrainScheduleService {
    void trainArrival(TrainSchedule[] trainSchedules, String station);
    void trainDeparture(TrainSchedule[] trainSchedules, String station);
}
