package extraTask.OnlineAnnouncementSystem.controller;

import extraTask.OnlineAnnouncementSystem.model.Address;
import extraTask.OnlineAnnouncementSystem.model.User;
import extraTask.OnlineAnnouncementSystem.payload.ApiResponse;
import extraTask.OnlineAnnouncementSystem.payload.UserDto;
import extraTask.OnlineAnnouncementSystem.service.UserService;
import extraTask.OnlineAnnouncementSystem.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    private static Scanner scanner = new Scanner(System.in);
    private static int index = 0;
    private static UserService userService = new UserServiceImpl();

    public void signIn(){
        boolean exit = false;
        while (!exit){
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            if (!checkEmail(email)){
                System.out.println("\nEmailda @ belgisi bo'lishi kerak\n");
                continue;
            }

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            UserDto userDto = new UserDto(email, password);
            ApiResponse apiResponse = userService.signIn(userDto);
            exit = apiResponse.isStatus();
            System.out.println("\n" + apiResponse.getMessage() + "\n");
        }
    }

    public void signUp(){
        boolean exit = false;
        while (!exit){
            System.out.print("Enter firstname: ");
            String firstname = scanner.nextLine();

            System.out.print("Enter lastname: ");
            String lastname = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            if (!checkEmail(email)){
                System.out.println("\nEmailda @ belgisi bo'lishi kerak\n");
                continue;
            }

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Enter Region: ");
            String region = scanner.nextLine();

            System.out.print("Enter District: ");
            String district = scanner.nextLine();

            ApiResponse apiResponse = userService.signUp(new User(index++, firstname, lastname, email, password, new Address(index, region, district)));
            exit = apiResponse.isStatus();

            System.out.println("\n" + apiResponse.getMessage() + "\n");
        }
    }

    public User getSystemUser(){
        return userService.getSystemUser();
    }

    private boolean checkEmail(String email){
        return email.matches(".*@.*");
    }
}

