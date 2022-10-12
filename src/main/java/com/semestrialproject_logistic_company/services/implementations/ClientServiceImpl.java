package com.semestrialproject_logistic_company.services.implementations;

import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.projections.ClientApi;
import com.semestrialproject_logistic_company.data.repository.ClientRepository;
import com.semestrialproject_logistic_company.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Sender saveClient(Sender client) {
        return this.clientRepository.saveAndFlush(client);
    }

    public ClientApi getClient(String telephone) {
        return this.clientRepository.findClientByTelephone(telephone);
    }

    public List<ClientApi> getClients() {
        return this.clientRepository.findAllBy();
    }

}
