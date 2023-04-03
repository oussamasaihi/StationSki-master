package com.example.stationski.stationski2;

import com.example.stationski.stationski2.entities.Skieur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Skieur S = new Skieur() ;
    }

}
