package homeworks.homework03.fitnessclub.repository;

import homeworks.homework03.fitnessclub.model.Client;
import homeworks.homework03.fitnessclub.model.Training;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{
    List<Client> clients = new ArrayList<>();

    public ClientRepositoryImpl() {
        init();
    }

    private void init() {
        clients.addAll(
                List.of(
                        new Client(1, "Tom", new ArrayList<>(1), 1),
                        new Client(2, "John", new ArrayList<>(2), 2),
                        new Client(3, "Max", new ArrayList<>(3), 3)
                )
        );
    }

    @Override
    public List<Client> getAll() {
        return clients;
    }

    @Override
    public Client getById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) return client;
        }
        return null;
    }
}
