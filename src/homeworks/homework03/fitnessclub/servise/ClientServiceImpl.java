package homeworks.homework03.fitnessclub.servise;

import homeworks.homework03.fitnessclub.model.Client;
import homeworks.homework03.fitnessclub.repository.ClientRepository;

import java.util.List;

public class ClientServiceImpl implements ClientService{
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    @Override
    public Client getById(int id) {
        return clientRepository.getById(id);
    }
}
