package homeworks.homework03.fitnessclub.servise;

import homeworks.homework03.fitnessclub.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client getById(int id);
}
