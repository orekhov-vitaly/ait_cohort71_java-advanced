package homeworks.homework03.fitnessclub.servise;

import homeworks.homework03.fitnessclub.model.Training;
import homeworks.homework03.fitnessclub.repository.TrainingRepository;

import java.util.List;

public class TrainingServiceImpl implements TrainingService{
    private final TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> getAll() {
        return trainingRepository.getAll();
    }

    @Override
    public Training getById(int id) {
        return trainingRepository.getById(id);
    }
}
