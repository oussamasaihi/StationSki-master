package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Moniteur;
import org.springframework.data.domain.Page;

import java.util.List;

public class MoniteurService implements IMoniteurService {

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return null;
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return null;
    }

    @Override
    public void delete(Long numMoniteur) {

    }

    @Override
    public Page<Moniteur> findAll() {
        return null;
    }

    @Override
    public List<Moniteur> findAllById() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Moniteur entity) {

    }
}
