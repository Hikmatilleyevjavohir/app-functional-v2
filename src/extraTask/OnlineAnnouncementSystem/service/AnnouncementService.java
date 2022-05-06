package extraTask.OnlineAnnouncementSystem.service;


import extraTask.OnlineAnnouncementSystem.model.Announcement;

public interface AnnouncementService {
    void viewAllAnnouncement();
    void addAnnouncement();
    void showMyAnnouncement();
    Announcement getOneAnnouncement(int id);
}
