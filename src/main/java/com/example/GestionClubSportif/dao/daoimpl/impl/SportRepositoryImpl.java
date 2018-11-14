package com.example.GestionClubSportif.dao.daoimpl.impl;

import com.example.GestionClubSportif.dao.daoimpl.SportRepository;
import com.example.GestionClubSportif.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class SportRepositoryImpl implements SportRepository {
    @Override
    public Sport creerSport(Sport sport) {
        this.save(sport);
        return sport;
    }

    @Override
    public List<Sport> recupererToutLesSport() {
        return this.findAll();
    }

    @Override
    public void supprimerSport(Sport sport) {
        this.delete(sport);
    }

    @Override
    public Sport modifierSport(String nomSport, String horaires, double prix, long id) {
        this.modifierSport(nomSport,horaires,prix,id);
        return new Sport(nomSport,horaires,prix);
    }
}
