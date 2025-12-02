package homeworks.homework03.fitnessclub.config;

import homeworks.homework03.fitnessclub.controller.ClientController;
import homeworks.homework03.fitnessclub.controller.TrainerController;
import homeworks.homework03.fitnessclub.controller.TrainingController;
import homeworks.homework03.fitnessclub.repository.*;
import homeworks.homework03.fitnessclub.servise.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TrainerRepository trainerRepository() {
        return new TrainerRepositoryImpl();
    }

    @Bean
    public TrainerService trainerService(TrainerRepository trainerRepository) {
        return new TrainerServiceImpl(trainerRepository);
    }

    @Bean
    public TrainerController trainerController(TrainerService trainerService) {
        return new TrainerController(trainerService);
    }

    @Bean
    public TrainingRepository trainingRepository() {
        return new TrainingRepositoryImpl();
    }

    @Bean
    public TrainingService trainingService(TrainingRepository trainingRepository) {
        return new TrainingServiceImpl(trainingRepository);
    }

    @Bean
    public TrainingController trainingController(TrainingService trainingService) {
        return new TrainingController(trainingService);
    }

    @Bean
    public ClientRepository clientRepository() {
        return new ClientRepositoryImpl();
    }

    @Bean
    public ClientService clientService(ClientRepository clientRepository) {
        return new ClientServiceImpl(clientRepository);
    }

    @Bean
    public ClientController clientController(ClientService clientService) {
        return new ClientController(clientService);
    }
}
