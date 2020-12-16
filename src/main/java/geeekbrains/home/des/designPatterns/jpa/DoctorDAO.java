package geeekbrains.home.des.designPatterns.jpa;

import geeekbrains.home.des.designPatterns.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDAO extends JpaRepository<Doctor, Long> {

}
