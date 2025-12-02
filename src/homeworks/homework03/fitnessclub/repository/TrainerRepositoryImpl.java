package homeworks.homework03.fitnessclub.repository;

import homeworks.homework03.fitnessclub.model.Trainer;

import java.util.ArrayList;
import java.util.List;

public class TrainerRepositoryImpl implements TrainerRepository{
    List<Trainer> trainers = new ArrayList<>();

    public TrainerRepositoryImpl() {
        init();
    }

    private void init() {
        trainers.addAll(List.of(
                new Trainer(1, "Trainer 1"),
                new Trainer(2, "Trainer 2"),
                new Trainer(3, "Trainer 3")
        ));
    }

    @Override
    public List<Trainer> getAll() {
        return trainers;
    }

    @Override
    public Trainer getById(int id) {
        for (Trainer trainer : trainers) {
            if (trainer.getId() == id) return trainer;
        }
        return null;
    }
}
