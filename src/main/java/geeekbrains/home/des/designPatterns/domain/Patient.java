package geeekbrains.home.des.designPatterns.domain;

import java.time.LocalDate;
import java.time.Period;


public class Patient {

    private Long id;
    private String name;
    private String password;
    private LocalDate birthDate;
    private String email;

    public Long getId() {
        return id;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    //можно удалить
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public void changeEmail(String email) {
        this.email = email;
    }

}
