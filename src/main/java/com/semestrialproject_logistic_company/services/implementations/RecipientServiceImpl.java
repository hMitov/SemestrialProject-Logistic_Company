package com.semestrialproject_logistic_company.services.implementations;

import com.semestrialproject_logistic_company.data.repository.RecipientRepository;
import com.semestrialproject_logistic_company.services.RecipientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecipientServiceImpl implements RecipientService {

    @Autowired
    RecipientRepository recipientRepository;
}
