package extraTask.Republic.sevice;

import extraTask.Republic.model.user.RegionKhokim;

import java.util.List;

public interface RegionKhokimService {
    void showKhokinInfo(List<RegionKhokim> regionKhokims, int regionId);
}
