package com.example.GestionClubSportif.dao.daoimpl;

import com.example.GestionClubSportif.model.Pratiquant;
import com.example.GestionClubSportif.model.Sport;
import org.springframework.aop.aspectj.annotation.PrototypeAspectInstanceFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface PratiquantRepository  extends JpaRepository<Pratiquant, Long> {

    Pratiquant creerPratiquant(Pratiquant pratiquant);
    void supprimerPratiquant(Long idPratiquant);
     List<Pratiquant> afficherToutPratiquant();
    void inscrirePratiquant(Pratiquant pratiquant, Sport sport);

}
