package com.example.GestionClubSportif;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.GestionClubSportif.model.Country;
import com.example.GestionClubSportif.service.serviceimp.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.GestionClubSportif")
public class GestionClubSportifApplication implements CommandLineRunner {

    @Autowired
    CountryServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(GestionClubSportifApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

     for (Country pays:service.recuprerToutPays()){
         System.out.println(pays);
     }



/*
 System.out.println("La liste des pays");
        for(Country country:service.recupererToutPays()){
            System.out.println(country);
        }
 */

       //
    }
}
