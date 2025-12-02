package homeworks.homework03.fitnessclub.repository;

import homeworks.homework03.fitnessclub.model.Training;

import java.util.List;

public interface TrainingRepository {
    List<Training> getAll();
    Training getById(int id);
}
