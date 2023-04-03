package com.example.stationski.stationski2.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Slf4j
public class Inscription implements Serializable {

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