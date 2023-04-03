package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.Repos.PisteRepo;
import com.example.stationski.stationski2.entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PisteService implements IpisteService {
    @Autowired
    private PisteRepo pisteRepo ;
    @Override
    public List<Piste> retrieveAllPistes() {
        return null;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return null;
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public ResponseEntity<Object> retrievePiste(Long numPiste) {
        return null;
    }

    @Override
    public void deletePiste(Long numPiste) {

    }
}
