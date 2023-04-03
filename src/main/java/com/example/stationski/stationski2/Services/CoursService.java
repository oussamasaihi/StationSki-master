package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.Repos.CoursRepo;
import com.example.stationski.stationski2.entities.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursService implements ICoursService {
    @Autowired
    private CoursRepo coursRepo ;

    public CoursService(CoursRepo coursRepo) {
        this.coursRepo = coursRepo;
    }

    @Override
    public List<Cours> retriveAllCourses() {
        return null;
    }

    @Override
    public Cours addCours(Cours cours) {
        return null;
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retrieveCours() {
        return null;
    }

    @Override
    public void deleteCours(Long id) {

    }
}

