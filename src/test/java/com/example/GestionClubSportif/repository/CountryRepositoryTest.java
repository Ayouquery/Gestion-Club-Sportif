package com.example.GestionClubSportif.repository;


import com.example.GestionClubSportif.DataTestConfiguration;
import com.example.GestionClubSportif.dao.CountryRepository;
import com.example.GestionClubSportif.model.Country;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.sql.DataSourceDefinition;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CountryRepositoryTest {

    @Autowired
    private CountryRepository repository;


    @Before
    public void init(){
        repository.save(new Country(1,"Maroc","ma"));
        repository.save(new Country(2,"Syria","sy"));
        repository.save(new Country(3,"Iraq","iq"));
        repository.save(new Country(4,"Egypte","eg"));
        repository.save(new Country(5,"Palestine","pl"));
        repository.save(new Country(6,"Yemen","ym"));

    }

    @Test
    public void shouldCreateCountry(){
        Country country = new Country();
        country.setId(7);
        country.setCode("lb");
        country.setName("Lybie");

        Country savedCountry = repository.save(country);

        assertThat(savedCountry).isNotNull();
        assertThat(savedCountry.getCode()).isEqualTo("lb");
        assertThat(savedCountry.getName()).isEqualTo("Lybie");
        assertThat(repository.findAll()).hasSize(7).endsWith(savedCountry);
    }


    @Test
    public void findCountryByCodeTest() {


        String code = "ma";

        Country country = repository.findCountryByCode(code);

        assertThat(country).isNotNull();
        assertThat(country.getName()).isEqualTo("Maroc");
    }


}
