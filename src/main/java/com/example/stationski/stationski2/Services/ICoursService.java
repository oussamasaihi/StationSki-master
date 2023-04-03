package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retriveAllCourses () ;
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    Cours retrieveCours();

    void deleteCours(Long id);
}
