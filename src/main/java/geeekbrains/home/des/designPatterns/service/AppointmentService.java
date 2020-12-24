package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAll();
    List<Appointment> getAllForDoctor(Long doctorId);
    List<Appointment> getAllForPatient(Long patientId);
    void delete(Long id);
    boolean update(Appointment appointment);
}
