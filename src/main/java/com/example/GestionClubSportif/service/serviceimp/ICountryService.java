package com.example.GestionClubSportif.service.serviceimp;

import com.example.GestionClubSportif.model.Country;

public interface ICountryService {
    Country findCountryByCode(String code);
    Iterable<Country> recupererToutPays();
    void supprimerPays(Country pays);
}
