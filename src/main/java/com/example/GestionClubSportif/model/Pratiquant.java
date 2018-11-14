package com.example.GestionClubSportif.model;

import javax.persistence.*;
import java.util.List;
@Entity(name = "Pratiquant")
@Table(name = "pratiquant")
public class Pratiquant {

    @Id
    @GeneratedValue
    private long idPratiquant;
    private String nomPratiquant;
    private String prenomPratiquant;
    private int age;
    private String cin;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "payement",
            joinColumns = @JoinColumn(name = "id_pratiquant"),
            inverseJoinColumns = @JoinColumn(name = "id_sport")
    )
    private List<Sport> listeDeSportPratiquees;

    public Pratiquant(){

    }


    public Pratiquant(String nomPratiquant, String prenomPratiquant, int age, String cin) {
        this.nomPratiquant = nomPratiquant;
        this.prenomPratiquant = prenomPratiquant;
        this.age = age;
        this.cin = cin;
    }

    public long getIdPratiquant() {
        return idPratiquant;
    }

    public void setIdPratiquant(long idPratiquant) {
        this.idPratiquant = idPratiquant;
    }

    public String getNomPratiquant() {
        return nomPratiquant;
    }

    public void setNomPratiquant(String nomPratiquant) {
        this.nomPratiquant = nomPratiquant;
    }

    public String getPrenomPratiquant() {
        return prenomPratiquant;
    }

    public void setPrenomPratiquant(String prenomPratiquant) {
        this.prenomPratiquant = prenomPratiquant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public List<Sport> getListeDeSportPratiquees() {
        return listeDeSportPratiquees;
    }

    public void setListeDeSportPratiquees(List<Sport> listeDeSportPratiquees) {
        this.listeDeSportPratiquees = listeDeSportPratiquees;
    }
}
