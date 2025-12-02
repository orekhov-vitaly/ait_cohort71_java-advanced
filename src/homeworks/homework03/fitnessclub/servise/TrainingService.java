package homeworks.homework03.fitnessclub.servise;

import homeworks.homework03.fitnessclub.model.Training;

import java.util.List;

public interface TrainingService {
    List<Training> getAll();
    Training getById(int id);
}
