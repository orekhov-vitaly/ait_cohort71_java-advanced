package homeworks.homework03.fitnessclub.repository;

import homeworks.homework03.fitnessclub.model.Trainer;

import java.util.List;

public interface TrainerRepository {
    List<Trainer> getAll();
    Trainer getById(int id);
}
