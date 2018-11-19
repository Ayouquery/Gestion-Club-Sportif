package com.example.GestionClubSportif.service.serviceimp;

import com.example.GestionClubSportif.model.Country;

import java.util.List;

public interface ICountryService {
    Country findCountryByCode(String code);
    Country findCountryById(Long id);
    List<Country> recuprerToutPays();
}
