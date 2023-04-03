package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.Repos.SkieurRepo;
import com.example.stationski.stationski2.entities.Skieur;
import com.example.stationski.stationski2.entities.TypeAbonnement;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Set;

public interface ISkieurService   {

    List<Skieur> findAll();

    ResponseEntity<Object> findById(Long id);

    void remove(Long id);

    void add(Skieur skieur);


    Skieur update(Skieur skieur);

    public Skieur aasignSkieurToPiste(Long numSieur , Long numPiste) ;
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

}
