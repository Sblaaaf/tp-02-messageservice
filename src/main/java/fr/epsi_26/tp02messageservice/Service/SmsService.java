package fr.epsi_26.tp02messageservice.Service;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par sms.";
    }
}