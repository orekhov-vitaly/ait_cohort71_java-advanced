package homeworks.homework03.fitnessclub.repository;

import homeworks.homework03.fitnessclub.model.Client;

import java.util.List;

public interface ClientRepository {
    List<Client> getAll();
    Client getById(int id);
}
