package com.semestrialproject_logistic_company;

import com.semestrialproject_logistic_company.config.UpdateSwaggerClasses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@SpringBootApplication
public class SemestrialProjectLogisticCompanyApplication {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Anna");
        arrayList.add("Rosen");
        arrayList.add("Ivana");
        arrayList.add("Bogdan");

        String text = "text";

        String res = arrayList.stream().filter(item -> item.equals("Bogdan")).findFirst().map(String::toUpperCase).get();
        System.out.println(res);


        System.out.println(ofNullable(text).map(String::toUpperCase).orElseGet(() -> "key"));

        SpringApplication.run(SemestrialProjectLogisticCompanyApplication.class, args);
        UpdateSwaggerClasses.run();
    }
}
