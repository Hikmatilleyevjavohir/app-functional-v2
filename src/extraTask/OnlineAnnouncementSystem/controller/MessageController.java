package extraTask.OnlineAnnouncementSystem.controller;

import extraTask.OnlineAnnouncementSystem.service.MessageService;
import extraTask.OnlineAnnouncementSystem.service.impl.MessageServiceImpl;

public class MessageController {
    private MessageService messageService = new MessageServiceImpl();

    public void writeMessage(){
        messageService.writeMessage();
    }

    public void inbox(){
        messageService.inbox();
    }
}
