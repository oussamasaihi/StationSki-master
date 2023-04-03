package com.example.stationski.stationski2.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numMoniteur ;
    String nomM ;
    String prenomM ;
    @Temporal(TemporalType.DATE)
    private Date dateRecru ;

    @OneToMany
    List<Cours> cours;


}