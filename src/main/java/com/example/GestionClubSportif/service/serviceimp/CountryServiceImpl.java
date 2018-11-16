package com.example.GestionClubSportif.service.serviceimp;

import com.example.GestionClubSportif.dao.CountryRepository;
import com.example.GestionClubSportif.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    CountryRepository repository;


    @Override
    public Country findCountryByCode(String code) {
        return repository.findCountryByCode(code);
    }


    @Override
    public Iterable<Country> recupererToutPays() {
        return repository.findAll();
    }

    @Override
    public void supprimerPays(Country pays) {
       repository.delete(pays);
    }
}
