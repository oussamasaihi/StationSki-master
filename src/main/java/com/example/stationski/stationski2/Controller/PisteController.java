package com.example.stationski.stationski2.Controller;

import com.example.stationski.stationski2.Services.IpisteService;
import com.example.stationski.stationski2.Services.PisteService;
import com.example.stationski.stationski2.entities.Piste;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pistes")
public class PisteController {
    public IpisteService ipisteService ;
    public PisteService pisteService ;
    @GetMapping
    public List<Piste> findALl() {return ipisteService.retrieveAllPistes();}
    @GetMapping("/{numPiste}")
    public ResponseEntity<Object> findById(@PathVariable Long numPiste){
        return ipisteService.retrievePiste(numPiste) ;
    }

}
