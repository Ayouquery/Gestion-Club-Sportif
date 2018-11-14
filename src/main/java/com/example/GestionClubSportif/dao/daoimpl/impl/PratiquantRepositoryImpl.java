package com.example.GestionClubSportif.dao.daoimpl.impl;

import com.example.GestionClubSportif.dao.daoimpl.PratiquantRepository;
import com.example.GestionClubSportif.model.Pratiquant;
import com.example.GestionClubSportif.model.Sport;

import java.util.ArrayList;
import java.util.List;

public abstract class PratiquantRepositoryImpl implements PratiquantRepository {


    @Override
    public Pratiquant creerPratiquant(Pratiquant pratiquant) {
        this.save(pratiquant);
        return pratiquant;
    }

    @Override
    public void supprimerPratiquant(Long idPratiquant) {
        this.deleteById(idPratiquant);

    }

    @Override
    public List<Pratiquant> afficherToutPratiquant() {
        return this.findAll();
    }

    @Override
    public void inscrirePratiquant(Pratiquant pratiquant, Sport sport) {
        List<Sport> listSport = new ArrayList<>();
        listSport.add(sport);
        pratiquant.setListeDeSportPratiquees(listSport);
        this.save(pratiquant);
    }

}
