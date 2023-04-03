package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Abonnement;
import com.example.stationski.stationski2.Repos.AbonnementRepo;
import com.example.stationski.stationski2.entities.Skieur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementService implements IAbonnementService {

    private final AbonnementRepo abonnementRepo;

    public AbonnementService(AbonnementRepo abonnementRepo) {
        this.abonnementRepo = abonnementRepo;
    }

    public List<Abonnement> findAll() {
        return abonnementRepo.findAll();
    }

    public Abonnement findById(Long id) {
        return abonnementRepo.findById(id).orElse(null);
    }

    public Abonnement save(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    public void deleteById(Long id) {
        abonnementRepo.deleteById(id);
    }

    @Override
    public void add(Skieur skieur) {

    }

    @Override
    public void update(Skieur skieur) {

    }

    @Override
    public void remove() {

    }

    @Override
    public Abonnement update(Abonnement abonnement) {
        return null;
    }
}
