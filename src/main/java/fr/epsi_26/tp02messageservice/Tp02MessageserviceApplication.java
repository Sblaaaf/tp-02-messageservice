package fr.epsi_26.tp02messageservice;

import fr.epsi_26.tp02messageservice.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tp02MessageserviceApplication {

    public static void main(String[] args) {
        // CONTEXTE
        ApplicationContext context = SpringApplication.run(Tp02MessageserviceApplication.class, args);

        // NotificationService
        NotificationService monService = context.getBean(NotificationService.class);

        // Méthode envoyer :
        monService.envoyerNotification();
    }
}
