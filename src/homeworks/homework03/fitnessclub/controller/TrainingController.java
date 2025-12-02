package homeworks.homework03.fitnessclub.controller;

import homeworks.homework03.fitnessclub.model.Training;
import homeworks.homework03.fitnessclub.servise.TrainingService;

import java.util.List;

public class TrainingController {
    private final TrainingService trainingService;

    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    public List<Training> getAll() {
        return trainingService.getAll();
    }

    public Training getById(int id) {
        return trainingService.getById(id);
    }
}
