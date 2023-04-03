package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.Repos.AbonnementRepo;
import com.example.stationski.stationski2.Repos.PisteRepo;
import com.example.stationski.stationski2.Repos.SkieurRepo;
import com.example.stationski.stationski2.entities.Abonnement;
import com.example.stationski.stationski2.entities.Piste;
import com.example.stationski.stationski2.entities.Skieur;
import com.example.stationski.stationski2.entities.TypeAbonnement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SkieurService implements ISkieurService {

    private final SkieurRepo skieurRepo ;

    private final PisteRepo pisteRepo ;

    private final AbonnementRepo abonnementRepo ;
    @Override
    public List<Skieur> findAll() {
        return skieurRepo.findAll();
    }

    @Override
    @Transactional
    public ResponseEntity<Object> findById(Long id) {
        Skieur skieur = skieurRepo.findById(id).orElse(null);
        if (skieur != null) {
            return ResponseEntity.ok(skieur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @Override
    public void remove(Long id) {
        skieurRepo.deleteById(id);
    }

    @Override
    public void add(Skieur skieur) {
        skieurRepo.save(skieur);
    }

    @Override
    public Skieur update(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    @Transactional
    public Skieur aasignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepo.findById(numSkieur)
                .orElseThrow(() -> new RuntimeException("Skieur not found"));

        Piste piste = pisteRepo.findById(numPiste)
                .orElseThrow(() -> new RuntimeException("Piste not found"));

        skieur.getPistes().add(piste);
        piste.getSkieurs().add(skieur);

        skieurRepo.save(skieur);
        pisteRepo.save(piste);

        return skieur;

    }


    @Transactional
    public Skieur assignSkieurToAbonnement (Long numSkieur , Long numAbon){

        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"not found");
        return null ;
    }

    @Override
    @Transactional
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        List<Skieur> skieurs = skieurRepo.findAll();
        List<Skieur> filteredSkieurs = new ArrayList<>();

        for (Skieur skieur : skieurs) {
            if (skieur.getTypeAbonnement() == typeAbonnement) {
                filteredSkieurs.add(skieur);
            }
        }

        return filteredSkieurs;
    }
}