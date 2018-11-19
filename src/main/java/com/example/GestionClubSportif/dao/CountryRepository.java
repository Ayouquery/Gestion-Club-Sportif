package com.example.GestionClubSportif.dao;

import com.example.GestionClubSportif.model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;


import java.util.List;

@org.springframework.stereotype.Repository
public interface CountryRepository extends CrudRepository<Country,Long> {

       Country findCountryByCode(String code);
       Country findCountryById(Long id);
       List<Country> findAll();
       @Query(value = "select * from countries",nativeQuery = true)
       List<Country> recuprerTtPays();

}


