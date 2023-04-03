package com.example.stationski.stationski2.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());

    }
    public Info infoAPI() {
        return new Info().title("Spring-Doc")
                .description("TP étude de cas")
                .contact(contactAPI());

    }


    public Contact contactAPI() {
        Contact contact = new Contact().name("Oussama")
                .email("Oussama.saihi@esprit.tn")
                .url("https://www.linkedin.com/oussamasaihi/");
        return contact;
    }
}
