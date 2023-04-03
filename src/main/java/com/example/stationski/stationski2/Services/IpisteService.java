package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Piste;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IpisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    ResponseEntity<Object> retrievePiste(Long numPiste);
    void deletePiste(Long numPiste);
}
