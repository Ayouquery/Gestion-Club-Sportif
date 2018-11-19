package com.example.GestionClubSportif.service.serviceimp;

import com.example.GestionClubSportif.dao.CountryRepository;
import com.example.GestionClubSportif.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    CountryRepository repository;


    @Override
    public Country findCountryByCode(String code) {
        return repository.findCountryByCode(code);
    }

    @Override
    public Country findCountryById(Long id) {
        return repository.findCountryById(id);
    }

    @Override
    public List<Country> recuprerToutPays() {
        return repository.recuprerTtPays();
    }
}
