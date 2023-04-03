package com.example.stationski.stationski2.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Slf4j
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numInscriprtion ;
    int numSemaine ;

    @ManyToOne
    @JoinColumn(name = "numSkieur")
    private Skieur skieur;

    @ManyToOne
    // @JoinColumn(name = "numCours")
    private Cours cour ;

}