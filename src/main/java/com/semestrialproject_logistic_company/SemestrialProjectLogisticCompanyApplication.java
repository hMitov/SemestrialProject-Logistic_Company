package com.semestrialproject_logistic_company;

import com.semestrialproject_logistic_company.config.UpdateSwaggerClasses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemestrialProjectLogisticCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SemestrialProjectLogisticCompanyApplication.class, args);
        UpdateSwaggerClasses.run();
    }
}
