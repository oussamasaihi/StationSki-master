package com.example.stationski.stationski2.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Slf4j
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCours ;
    int niveau ;
    TypeCours typeCours ;
    Support support ;
    float prix ;
    int creneau ;

    @OneToMany(mappedBy = "cour")
    List<Inscription> inscriptions;


}