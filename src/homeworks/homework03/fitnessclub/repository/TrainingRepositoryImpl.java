package homeworks.homework03.fitnessclub.repository;

import homeworks.homework03.fitnessclub.model.Training;

import java.util.ArrayList;
import java.util.List;

public class TrainingRepositoryImpl implements TrainingRepository{
    List<Training> trainings = new ArrayList<>();

    public TrainingRepositoryImpl() {
        init();
    }

    private void init() {
        trainings.addAll(List.of(
                new Training(1, "Training 1"),
                new Training(2, "Training 2"),
                new Training(3, "Training 3")
        ));
    }

    @Override
    public List<Training> getAll() {
        return trainings;
    }

    @Override
    public Training getById(int id) {
        for (Training training : trainings) {
            if (training.getId() == id) return training;
        }
        return null;
    }
}
