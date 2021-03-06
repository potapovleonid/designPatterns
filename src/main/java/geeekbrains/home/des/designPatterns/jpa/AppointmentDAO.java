package geeekbrains.home.des.designPatterns.jpa;

import geeekbrains.home.des.designPatterns.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDAO extends JpaRepository<Appointment, Long> {
}
