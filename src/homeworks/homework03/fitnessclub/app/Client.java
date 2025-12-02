package homeworks.homework03.fitnessclub.app;

import homeworks.homework03.fitnessclub.controller.ClientController;
import homeworks.homework03.fitnessclub.controller.TrainerController;
import homeworks.homework03.fitnessclub.controller.TrainingController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("homeworks.homework03.fitnessclub.config");

        TrainerController trainerController = context.getBean(TrainerController.class);
        TrainingController trainingController = context.getBean(TrainingController.class);
        ClientController clientController = context.getBean(ClientController.class);

        System.out.println(trainerController.getAll());
        System.out.println(trainerController.getById(2));

        System.out.println(trainingController.getAll());
        System.out.println(trainingController.getById(2));

        System.out.println(clientController.getAll());
        System.out.println(clientController.getById(2));
    }
}
