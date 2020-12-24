package geeekbrains.home.des.designPatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "user_tbl")
public class User {
    private static final String SEQUANCE_NAME = "user_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUANCE_NAME)
    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "login_fld")
    private String login;

    @Column(name = "password_fld")
    private String password;

    @Column(name = "name_fld")
    private String name;

    @Column(name = "email_fld")
    private String email;

    @Column(name = "birth_date_fld")
    private LocalDate birthDate;

    @Column(name = "role_fld")
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
