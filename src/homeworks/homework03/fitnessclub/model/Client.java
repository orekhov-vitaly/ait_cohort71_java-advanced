package homeworks.homework03.fitnessclub.model;

import java.util.List;

public class Client {
    private final int id;
    private String name;
    private List<Integer> trainingsId;
    private int trainerId;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client(int id, String name, List<Integer> trainingsId, int trainerId) {
        this.id = id;
        this.name = name;
        this.trainingsId = trainingsId;
        this.trainerId = trainerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTrainings() {
        return trainingsId;
    }

    public void setTrainings(List<Integer> trainingsId) {
        this.trainingsId = trainingsId;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainingsId=" + trainingsId +
                ", trainerId=" + trainerId +
                '}';
    }
}
