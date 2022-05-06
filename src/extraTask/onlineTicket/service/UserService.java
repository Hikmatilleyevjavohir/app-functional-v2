package extraTask.onlineTicket.service;

import extraTask.onlineTicket.dto.UserDto;
import extraTask.onlineTicket.model.ApiResponse;
import extraTask.onlineTicket.model.User;

public interface UserService {
    ApiResponse signIn(User[] users, UserDto userDto);
    ApiResponse changePassword(User[] users, UserDto userDto);
    void showPersonalData(User user);
}
