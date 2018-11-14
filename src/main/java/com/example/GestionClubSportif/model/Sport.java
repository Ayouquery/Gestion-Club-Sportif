package com.example.GestionClubSportif.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;


@Entity(name = "sport")
@Table(name = "sport")
public class Sport {
    private long idSport;
    private String nomSport;
    private String horaires;
    private double prix;

    @ManyToMany(mappedBy = "pratiquant")
    private List<Pratiquant> listeDesPersonnesInscrit;



    public Sport() {
    }

    public Sport(String nomSport, String horaires, double prix) {
        this.nomSport = nomSport;
        this.horaires = horaires;
        this.prix = prix;
    }

    public long getIdSport() {
        return idSport;
    }

    public void setIdSport(long idSport) {
        this.idSport = idSport;
    }

    public String getNomSport() {
        return nomSport;
    }

    public void setNomSport(String nomSport) {
        this.nomSport = nomSport;
    }

    public String StringgetHoraires() {
        return horaires;
    }

    public void setHoraires(String horaires) {
        this.horaires = horaires;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    public List<Pratiquant> getListeDesPersonnesInscrit() {
        return listeDesPersonnesInscrit;
    }

    public void setListeDesPersonnesInscrit(List<Pratiquant> listeDesPersonnesInscrit) {
        this.listeDesPersonnesInscrit = listeDesPersonnesInscrit;
    }
}
