package extraTask.onlineTicket.service.impl;

import extraTask.onlineTicket.Main;
import extraTask.onlineTicket.dto.UserDto;
import extraTask.onlineTicket.model.ApiResponse;
import extraTask.onlineTicket.model.User;
import extraTask.onlineTicket.service.UserService;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public ApiResponse signIn(User[] users, UserDto userDto) {
        for (User user : users) {
            if (user.getLogin().equals(userDto.getLogin())){
                if (user.getPassword().equals(userDto.getPassword())){
                    System.out.println("\n" + user.getFullName() + " " + Main.messages[0].getMessage());
                    return new ApiResponse(Main.messages[0], true);
                }
            }
        }
        return new ApiResponse(Main.messages[1], false);
    }

    @Override
    public ApiResponse changePassword(User[] users, UserDto userDto) {
        for (User user : users) {
            if (user.getLogin().equals(userDto.getLogin())){
                user.setPassword(userDto.getPassword());
                System.out.println("\n" + Main.messages[2].getMessage() + "\n");
                return new ApiResponse(Main.messages[2], true);
            }
        }
        System.out.println(Main.messages[1].getMessage());
        return new ApiResponse(Main.messages[1], false);
    }

    @Override
    public void showPersonalData(User user) {
        System.out.println("Personal Data");
        System.out.println("-------------------------------------------------");
        System.out.println("FirstName: " + user.getFirstname() + " | " + "LastName: " + user.getLastname() + "\n" +
                "Login: " + user.getLogin() + " |  Password: " + user.getPassword() + "\n" +
                "DocumentType: " + user.getDocumentType() + " | Document: " + user.getDocument());
        System.out.println("-------------------------------------------------");
    }
}
