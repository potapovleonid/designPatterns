package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Patient;
import geeekbrains.home.des.designPatterns.jpa.PatientDAO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientDAO patientDAO;

    public PatientServiceImpl(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    public void save(Patient patient) {
        patientDAO.save(patient);
    }

    @Override
    public boolean update(Patient patient) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
