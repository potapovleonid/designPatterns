package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Patient;

import java.time.LocalDate;

public interface PatientService {
    Patient findFirstByLogin(String login);
    void save(Patient patient);
    boolean update(Patient patient);
    void deleteById(Long id);
}
