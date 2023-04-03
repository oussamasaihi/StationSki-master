package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInscriptionService extends JpaRepository<Inscription,Long> {
}
