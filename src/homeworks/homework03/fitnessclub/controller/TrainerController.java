package homeworks.homework03.fitnessclub.controller;

import homeworks.homework03.fitnessclub.model.Trainer;
import homeworks.homework03.fitnessclub.servise.TrainerService;

import java.util.List;

public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    public List<Trainer> getAll() {
        return trainerService.getAll();
    }

    public Trainer getById(int id) {
        return trainerService.getById(id);
    }
}
