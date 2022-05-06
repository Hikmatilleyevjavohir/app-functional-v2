package extraTask.OnlineAnnouncementSystem.service;

import extraTask.OnlineAnnouncementSystem.model.User;
import extraTask.OnlineAnnouncementSystem.payload.ApiResponse;
import extraTask.OnlineAnnouncementSystem.payload.UserDto;

import java.util.List;

public interface UserService {
    ApiResponse signIn(UserDto userDto);
    ApiResponse signUp(User user);
    User getSystemUser();
}
