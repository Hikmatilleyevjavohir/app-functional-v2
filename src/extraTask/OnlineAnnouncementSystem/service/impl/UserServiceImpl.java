package extraTask.OnlineAnnouncementSystem.service.impl;

import extraTask.OnlineAnnouncementSystem.model.User;
import extraTask.OnlineAnnouncementSystem.payload.ApiResponse;
import extraTask.OnlineAnnouncementSystem.payload.UserDto;
import extraTask.OnlineAnnouncementSystem.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<>();
    private static UserDto systemUser = new UserDto();

    @Override
    public ApiResponse signIn(UserDto userDto) {

        if (users.isEmpty()) {
            return new ApiResponse("Userlar mavjud emas", false);
        }

        for (User user : users) {
            if (user.getEmail().equals(userDto.getEmail()) && user.getPassword().equals(userDto.getPassword())) {
                systemUser.setEmail(userDto.getEmail());
                systemUser.setPassword(userDto.getPassword());
                return new ApiResponse(user.getFirstname() + "  Welcome to Online Announcement System ", true);
            }
        }

        return new ApiResponse("Bunday User mavjud emas!", false);

    }

    @Override
    public ApiResponse signUp(User user) {
        for (User user1 : users) {
            if (user1.getEmail().equals(user.getEmail()))
                return new ApiResponse("Sorry Bunday User mavjud! ", false);
        }
        users.add(user);
        return new ApiResponse("Successfully", true);
    }

    @Override
    public User getSystemUser() {
        for (User user : users) {
            if (systemUser != null){
                if (user.getEmail().equals(systemUser.getEmail()) && user.getPassword().equals(systemUser.getPassword())) {
                    return user;
                }
            }
        }
        return new User();
    }
}
