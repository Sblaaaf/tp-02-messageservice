package fr.epsi_26.tp02messageservice.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Message dev.";
    }
}