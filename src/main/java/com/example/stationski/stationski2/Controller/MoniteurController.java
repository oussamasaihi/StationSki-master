package com.example.stationski.stationski2.Controller;

import com.example.stationski.stationski2.Services.IMoniteurService;
import com.example.stationski.stationski2.entities.Moniteur;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Moniteur")
public class MoniteurController {
    private IMoniteurService iMoniteurService;

    @GetMapping
    public Page<Moniteur> findALl() {
        return iMoniteurService.findAll();
    }
    @GetMapping("/id")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        return (ResponseEntity<Object>) iMoniteurService.findAllById();
    }

}


