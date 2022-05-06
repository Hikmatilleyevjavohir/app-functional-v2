package extraTask.Republic.sevice;

import extraTask.Republic.model.user.DistrictKhokim;

import java.util.List;

public interface DistrictKhokimService {
    void showDistrictKhokim(List<DistrictKhokim> districtKhokims, int districtId);
}
