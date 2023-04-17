package com.example.stationski.stationski2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Slf4j
public class Skieur implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numSkieur ;
    public String nomS ;
    public String prenomS ;
    public LocalDate dateNaissance ;
    public String ville ;
    @Enumerated(EnumType.ORDINAL)
    TypeAbonnement typeAbonnement ;
    @OneToOne
    // @JoinColumn(name = "numAbon")
    private Abonnement abonnement;

    @JsonIgnore
    /*@ManyToMany(mappedBy = "piste")
   /* @JoinTable(name = "skieur_piste",
            joinColumns = @JoinColumn(name = "skieur_id"),
            inverseJoinColumns = @JoinColumn(name = "piste_id"))*/
    //private Set<Piste> pistes ;
    @ManyToMany
    @JoinTable(
            name = "skieur_piste",
            joinColumns = @JoinColumn(name = "skieur_id"),
            inverseJoinColumns = @JoinColumn(name = "piste_id")
    )
    private Set<Piste> pistes;


    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany(mappedBy = "skieur")
    List<Inscription> inscriptionList;



    public TypeAbonnement getTypeAbonnement() {
        return typeAbonnement ;
    }
}