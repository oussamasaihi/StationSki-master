package com.example.stationski.stationski2.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Abonnement implements Serializable {

    //  @OneToOne(cascade =CascadeType.ALL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    TypeAbonnement typeAbonnement ;

    public LocalDate getId() {
        return null;
    }
}