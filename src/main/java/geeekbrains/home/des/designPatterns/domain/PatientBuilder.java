package geeekbrains.home.des.designPatterns.domain;

import java.time.LocalDate;

public class PatientBuilder {
    private final Patient patient;

    public PatientBuilder() {
        this.patient = new Patient();
    }

    public PatientBuilder setName(String name) throws Exception{
        patient.setName(name);
        return this;
    }

    public PatientBuilder setPassword(String password) throws Exception{
        patient.setPassword(password);
        return this;
    }

    public PatientBuilder setDate(LocalDate birthDate) throws Exception{
        patient.setBirthDate(birthDate);
        return this;
    }

    public PatientBuilder setEmail(String email) throws Exception{
        patient.setEmail(email);
        return this;
    }

    public Patient build(){
        return patient;
    }
}
