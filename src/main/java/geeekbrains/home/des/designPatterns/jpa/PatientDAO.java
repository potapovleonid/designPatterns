package geeekbrains.home.des.designPatterns.jpa;

import geeekbrains.home.des.designPatterns.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDAO extends JpaRepository<Patient, Long> {
    void deleteById(Long id);
    Patient findFirstByName(String login);
}
