package com.example.stationski.stationski2.Repos;

import com.example.stationski.stationski2.entities.Skieur;
import com.example.stationski.stationski2.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SkieurRepo extends JpaRepository<Skieur,Long> {
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
