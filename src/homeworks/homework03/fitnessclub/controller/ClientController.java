package homeworks.homework03.fitnessclub.controller;

import homeworks.homework03.fitnessclub.model.Client;
import homeworks.homework03.fitnessclub.servise.ClientService;

import java.util.List;

public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public List<Client> getAll() {
        return clientService.getAll();
    }

    public Client getById(int id) {
        return clientService.getById(id);
    }
}
