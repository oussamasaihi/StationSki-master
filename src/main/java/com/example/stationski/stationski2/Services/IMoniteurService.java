package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Moniteur;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IMoniteurService
{
    List<Moniteur> retrieveAllMoniteurs ();
    Moniteur addMoniteur (Moniteur moniteur) ;
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

    void delete(Long numMoniteur);

    Page<Moniteur> findAll();

    List<Moniteur> findAllById();

    long count();

    void deleteById(Long aLong);

    void delete(Moniteur entity);
}
