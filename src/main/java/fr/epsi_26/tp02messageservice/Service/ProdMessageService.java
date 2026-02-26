package fr.epsi_26.tp02messageservice.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Message prod.";
    }
}
