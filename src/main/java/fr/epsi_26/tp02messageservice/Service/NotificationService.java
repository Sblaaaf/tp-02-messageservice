package fr.epsi_26.tp02messageservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    // INTERFACE
    private MessageService messageService;

    // SETTER
    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void envoyerNotification() {
        System.out.println(messageService.getMessage());
    }
}