package com.example.stationski.stationski2.Controller;

import com.example.stationski.stationski2.Services.ISkieurService;
import com.example.stationski.stationski2.entities.Abonnement;
import com.example.stationski.stationski2.entities.Skieur;
import com.example.stationski.stationski2.entities.TypeAbonnement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieurs")
@RequiredArgsConstructor
public class SkieurController {
    private final ISkieurService iSkieurService ;
    @GetMapping
    public List<Skieur> findAll(){
        return iSkieurService.findAll() ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        return iSkieurService.findById(id) ;
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable long id){
        iSkieurService.remove(id);
    }

    @PostMapping
    public void add(@RequestBody Skieur skieur){
        iSkieurService.add(skieur);
    }

    @PutMapping
    public Skieur update(@RequestBody Skieur skieur){
        return iSkieurService.update(skieur);
    }

    @PostMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkieurToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste) {
        return iSkieurService.aasignSkieurToPiste(numSkieur, numPiste);
    }

    @GetMapping("/subscription/{typeAbonnement}")
    public List<Skieur> retrieveSkieursBySubscriptionType(@PathVariable TypeAbonnement typeAbon) {
        return iSkieurService.retrieveSkiersBySubscriptionType(typeAbon);
    }

}
