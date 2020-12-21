package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Patient;
import geeekbrains.home.des.designPatterns.jpa.PatientDAO;
import org.springframework.stereotype.Service;


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
        if (patient == null){
            throw new RuntimeException("Enter null user");
        }
        patientDAO.save(patient);
        return true;
    }

    @Override
    public void deleteById(Long id) {
        patientDAO.deleteById(id);
    }

    @Override
    public Patient findFirstByLogin(String login) {
        if (login == null){
            throw new RuntimeException("Enter login for find is null");
        }
        return patientDAO.findFirstByName(login);
    }
}
