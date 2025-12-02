package homeworks.homework03.fitnessclub.servise;

import homeworks.homework03.fitnessclub.model.Trainer;
import homeworks.homework03.fitnessclub.repository.TrainerRepository;

import java.util.List;

public class TrainerServiceImpl implements TrainerService{
    private final TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> getAll() {
        return trainerRepository.getAll();
    }

    @Override
    public Trainer getById(int id) {
        return trainerRepository.getById(id);
    }
}
