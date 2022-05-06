package extraTask.OnlineAnnouncementSystem.service.impl;

import extraTask.OnlineAnnouncementSystem.Main;
import extraTask.OnlineAnnouncementSystem.controller.CategoryController;
import extraTask.OnlineAnnouncementSystem.model.Announcement;
import extraTask.OnlineAnnouncementSystem.model.Category;
import extraTask.OnlineAnnouncementSystem.model.User;
import extraTask.OnlineAnnouncementSystem.service.AnnouncementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnnouncementServiceImpl implements AnnouncementService {
    public static ArrayList<Announcement> announcements = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private CategoryController categoryController = new CategoryController();
    private UserServiceImpl userService = new UserServiceImpl();


    @Override
    public void viewAllAnnouncement() {
        int index = 1;
        System.out.println("All Announcement! ");
        System.out.println("---------------------------------------------------");

        if (announcements.isEmpty()) {
            System.out.println("No data");
            System.out.println("---------------------------------------------------");
            return;
        }

        for (Announcement announcement : announcements) {
            System.out.println(index++ + ". " + announcement.getUser().getFirstname() +
                    "  |  " + announcement.getUser().getAddress().getDistrict() +
                    ", " + announcement.getUser().getAddress().getRegion() + "  |  " +
                    announcement.getTitle() + "  |  " + announcement.getBody() + "  |  " +
                    announcement.getCost() + " So'm ");
        }

        System.out.println("---------------------------------------------------");
    }

    @Override
    public void addAnnouncement() {
        int index = 1;
        System.out.print("Title: ");
        String title = scanner.nextLine();

        int categoryId = categoryController.showCategory();
        if (categoryId == -1) {
            System.out.println("Bunday Category mavjud emas");
            return;
        }

        System.out.print("Body: ");
        String body = scanner.nextLine();

        System.out.print("Cost: ");
        double cost = scanner.nextDouble();

        announcements.add(new Announcement(index++, title, Main.categories.get(categoryId), body, cost, userService.getSystemUser()));
        System.out.println("Announcement saved ");
    }

    @Override
    public void showMyAnnouncement() {
        int index = 1;

        System.out.println("My All Announcement  ");
        System.out.println("----------------------------------------------------------------------------");

        for (Announcement announcement : announcements) {
            if (announcement.getUser().equals(userService.getSystemUser())) {
                System.out.println(index++ + ". " + announcement.getUser().getFirstname() +
                        "  |  " + announcement.getUser().getAddress().getDistrict() +
                        ", " + announcement.getUser().getAddress().getRegion() + "  |  " +
                        announcement.getTitle() + "  |  " + announcement.getBody() + "  |  " +
                        announcement.getCost() + " So'm ");
            }
        }

        System.out.println("----------------------------------------------------------------------------");
    }

    @Override
    public Announcement getOneAnnouncement(int id) {
        return announcements.get(id);
    }
}
