package com.example.GestionClubSportif.dao.daoimpl;

import com.example.GestionClubSportif.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.nio.channels.spi.SelectorProvider;
import java.util.List;

@Repository
@Transactional
public interface SportRepository extends JpaRepository<Sport,Long> {
    Sport creerSport(Sport sport);
    List<Sport> recupererToutLesSport();
    void supprimerSport(Sport sport);

    @Modifying
    @Query("update sport set nom_sport = ?1, horaires = ?2, prix = ?3 where id_sport = ?4")
    Sport modifierSport(String nomSport,String horaires, double prix,long id);
}
