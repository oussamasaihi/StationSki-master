package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Abonnement;
import com.example.stationski.stationski2.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbonnementService {
    void add(Skieur skieur);

    void update(Skieur skieur);

    void remove();
}
