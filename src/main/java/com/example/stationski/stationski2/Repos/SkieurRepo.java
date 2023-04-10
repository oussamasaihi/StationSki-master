package com.example.stationski.stationski2.Repos;

import com.example.stationski.stationski2.entities.Skieur;
import com.example.stationski.stationski2.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SkieurRepo extends JpaRepository<Skieur,Long> {
    //public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    @Query(value = "SELECT * " +
            "FROM skieur s " +
            "JOIN abonnement a on " +
            "s.abonnement_num_abon = a.num_abon" +
            "WHERE a.type_abonnement = :typeabonnement  ",nativeQuery = true)
    public List<Skieur> retrieveSkiersBySubscriptionTypeSQL(@Param("typeabonnement") TypeAbonnement typeAbonnement);
    @Query(value = "SELECT s " +
            "FROM Skieur s " +
            "where s.abonnement.typeAbonnement = :typeabonnement ")
    public List<Skieur> retrieveSkiersBySubscriptionTypeJPQL(@Param("typeabonnement") TypeAbonnement typeAbonnement);

    @Query(value = "SELECT * " +
            "FROM skieur s " +
            "ORDER BY (SELECT COUNT * FROM inscription i WHERE i.num_skieur = s.num_skieur)",nativeQuery = true)
     List<Skieur>OrderSkieurByNbrInscription();
    @Query(value = "SELECT n FROM Skieur n ORDER BY n.inscriptionList.size" )
    List<Skieur>OrderSkieurByNbrInscriptionJPQL();
    @Query(value = "SELECT * " +
            "FROM skieur s " +
            "JOIN inscription i ON i.num_skieur = s.num_skieur" +
            "JOIN cours c ON c.num_cours = i.cour_num_cours" +
            "JOIN moniteur_cours mc ON c.num_cours = mc.cours_num_cours" +
            "JOIN moniteur m ON m.num_moniteur = mc.moniteur_num_moniteur" +
            "WHERE m.nomm = :nom", nativeQuery = true)
    List<Skieur>ListeOfSkieursByCoursMoniteurSQL(@Param ("nom") String nom );
    @Query("select s from Skieur s " +
            "JOIN Inscription i " +
            "on i.skieur.numSkieur = s.numSkieur " +
            "JOIN Moniteur m on i.cour member of m.cours where m.nomM = :nom " )
    List<Skieur>ListeOfSkieursByCoursMoniteurJPQL(@Param ("nom") String nom );


}
