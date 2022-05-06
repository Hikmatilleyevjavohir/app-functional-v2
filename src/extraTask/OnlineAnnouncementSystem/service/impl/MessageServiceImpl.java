package extraTask.OnlineAnnouncementSystem.service.impl;

import extraTask.OnlineAnnouncementSystem.controller.AnnouncementController;
import extraTask.OnlineAnnouncementSystem.controller.UserController;
import extraTask.OnlineAnnouncementSystem.model.Announcement;
import extraTask.OnlineAnnouncementSystem.model.Message;
import extraTask.OnlineAnnouncementSystem.model.User;
import extraTask.OnlineAnnouncementSystem.service.AnnouncementService;
import extraTask.OnlineAnnouncementSystem.service.MessageService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageServiceImpl implements MessageService {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Message> messages = new ArrayList<>();
    private UserController userController = new UserController();
    private AnnouncementController announcementController = new AnnouncementController();

    @Override
    public void writeMessage() {
        int index = 1;
        announcementController.viewAllAnnouncement();
        if (AnnouncementServiceImpl.announcements.isEmpty()){
            return;
        }
        System.out.println("Choose the announcement:");
        int annoucementNumber = scanner.nextInt();
        Announcement choosedAnnouncement = announcementController.getOneAnnouncement(annoucementNumber - 1);

        System.out.println("\n" + choosedAnnouncement.getTitle() +
                 "  |  " + choosedAnnouncement.getUser().getFirstname() + "  |  " +
                 choosedAnnouncement.getUser().getAddress().getDistrict() + ", " +  choosedAnnouncement.getUser().getAddress().getRegion());
        System.out.println("New message");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner1.nextLine();


        System.out.print("Body: ");
        String body = scanner1.nextLine();

        messages.add(new Message(index++, title, body, choosedAnnouncement, userController.getSystemUser(), choosedAnnouncement.getUser()));
        System.out.println("Message sent\n");
    }

    @Override
    public void inbox() {
        int index = 1;
        User systemUser = userController.getSystemUser();
        System.out.println("All Messages");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).getToUser().equals(systemUser)){
                System.out.println(index++ + messages.get(i).getTitle() + "  |  " +
                        messages.get(i).getBody() + "  |  " + messages.get(i).getFromUser().getFirstname() + "  |  " +
                        messages.get(i).getFromUser().getAddress().getDistrict() + ", " + messages.get(i).getFromUser().getAddress().getRegion());
            }
        }

        System.out.println("---------------------------------------------------");
    }
}
