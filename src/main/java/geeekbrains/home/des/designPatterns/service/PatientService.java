package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Patient;

import java.time.LocalDate;

public interface PatientService {
    void save(Patient patient);
    boolean update(Patient patient);
    void delete(Long id);
}
