package extraTask.Republic.sevice;

import extraTask.Republic.model.user.President;

import java.util.List;

public interface PresidentService {
    void showPresidentInfo(List<President> presidents, int republicId);
}
