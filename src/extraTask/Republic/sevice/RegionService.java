package extraTask.Republic.sevice;

import extraTask.Republic.model.area.Region;
import extraTask.Republic.model.user.RegionKhokim;

import java.util.List;

public interface RegionService {
    int showRegion(List<Region> regions, int republicId);
}
