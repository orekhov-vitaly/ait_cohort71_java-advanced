package homeworks.homework03.fitnessclub.servise;

import homeworks.homework03.fitnessclub.model.Trainer;

import java.util.List;

public interface TrainerService {
    List<Trainer> getAll();
    Trainer getById(int id);
}
