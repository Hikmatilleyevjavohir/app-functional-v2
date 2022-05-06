package extraTask.onlineTicket.controller;

import extraTask.onlineTicket.Main;
import extraTask.onlineTicket.dto.UserDto;
import extraTask.onlineTicket.model.ApiResponse;
import extraTask.onlineTicket.model.User;
import extraTask.onlineTicket.service.impl.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    private static Scanner scanner = new Scanner(System.in);
    private static UserServiceImpl userService = new UserServiceImpl();

    public UserDto signIn(User[] users) {
        while (true) {
            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            UserDto userDto = new UserDto(login, password);
            ApiResponse apiResponse = userService.signIn(users, userDto);
            if (apiResponse.isStatus()) {
                return userDto;
            }
        }

    }

    public void changePassword(User[] users) {
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getLogin().equals(login)) {
                if (user.getPassword().equals(password)) {
                    while (true) {
                        System.out.print("Enter New password: ");
                        String newPassword = scanner.nextLine();
                        System.out.print("Confirm password: ");
                        String confirmPassword = scanner.nextLine();
                        if (newPassword.equals(confirmPassword)) {
                            userService.changePassword(users, new UserDto(login, newPassword));
                            return;
                        }
                        System.out.println(Main.messages[1].getMessage());
                    }
                }
            }
        }
        System.out.println(Main.messages[1].getMessage());
    }

    public void showPersonalData(User[] users, UserDto userDto) {
        for (User user : users) {
            if (user.getLogin().equals(userDto.getLogin()) && user.getPassword().equals(userDto.getPassword())) {
                userService.showPersonalData(user);
                return;
            }
        }

        System.out.println(Main.messages[3].getMessage());
    }
}
