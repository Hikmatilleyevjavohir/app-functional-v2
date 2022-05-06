package extraTask.OnlineAnnouncementSystem.controller;

import extraTask.OnlineAnnouncementSystem.model.Announcement;
import extraTask.OnlineAnnouncementSystem.service.AnnouncementService;
import extraTask.OnlineAnnouncementSystem.service.impl.AnnouncementServiceImpl;


public class AnnouncementController {
    private AnnouncementService announcementService = new AnnouncementServiceImpl();

    public void addAnnouncement(){
        announcementService.addAnnouncement();
    }

    public void viewAllAnnouncement(){
        announcementService.viewAllAnnouncement();
    }

    public void showMyAnnouncement(){
        announcementService.showMyAnnouncement();
    }

    public Announcement getOneAnnouncement(int id){
        return announcementService.getOneAnnouncement(id);
    }

}
