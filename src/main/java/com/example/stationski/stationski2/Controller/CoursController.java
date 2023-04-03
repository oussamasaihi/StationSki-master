package com.example.stationski.stationski2.Controller;

import com.example.stationski.stationski2.Services.ICoursService;
import com.example.stationski.stationski2.entities.Cours;
import com.example.stationski.stationski2.entities.Skieur;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cours")
public class CoursController {
    private ICoursService iCoursService ;
    @GetMapping
    public List<Skieur> findAll(){
        return (List<Skieur>) iCoursService.retrieveCours();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        return findById(id) ;
    }
    @DeleteMapping("/{id}")
    public void remove(@RequestBody long id){
        iCoursService.deleteCours(id);
    }
    @PostMapping
    void add(@RequestBody Cours cours){
        iCoursService.addCours(cours);
    }

    @PutMapping
    public void update(@RequestBody Cours cours){
        iCoursService.updateCours(cours);
    }
}