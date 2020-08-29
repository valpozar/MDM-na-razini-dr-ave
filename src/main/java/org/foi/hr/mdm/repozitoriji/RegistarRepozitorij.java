package org.foi.hr.mdm.repozitoriji;

import org.foi.hr.mdm.entiteti.Registar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistarRepozitorij extends JpaRepository<Registar, Integer> {
    Registar findById(int id);
}
