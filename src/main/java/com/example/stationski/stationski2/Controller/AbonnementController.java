package com.example.stationski.stationski2.Controller;

import com.example.stationski.stationski2.Services.AbonnementService;
import com.example.stationski.stationski2.Services.IAbonnementService;
import com.example.stationski.stationski2.entities.Abonnement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonnements")
@RequiredArgsConstructor
public class AbonnementController {

    private final AbonnementService abonnementService;

    @GetMapping
    public List<Abonnement> findAll() {
        return abonnementService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Abonnement> findById(@PathVariable Long id) {
        Abonnement abonnement = abonnementService.findById(id);
        if (abonnement == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(abonnement);
    }

    @PostMapping
    public ResponseEntity<Abonnement> save(@RequestBody Abonnement abonnement) {
        abonnement = abonnementService.save(abonnement);
        return ResponseEntity.status(HttpStatus.CREATED).body(abonnement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Abonnement> update(@PathVariable Long id, @RequestBody Abonnement abonnement) {
        Abonnement existingAbonnement = abonnementService.findById(id);
        if (existingAbonnement == null) {
            return ResponseEntity.notFound().build();
        }
        abonnement.setDateFin(existingAbonnement.getId());
        abonnement = abonnementService.save(abonnement);
        return ResponseEntity.ok(abonnement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        Abonnement abonnement = abonnementService.findById(id);
        if (abonnement == null) {
            return ResponseEntity.notFound().build();
        }
        abonnementService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
