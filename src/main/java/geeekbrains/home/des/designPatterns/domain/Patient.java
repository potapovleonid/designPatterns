package geeekbrains.home.des.designPatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "patient_tbl")
public class Patient {

    private static final String SEQUANCE_NAME = "patient_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUANCE_NAME)
    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
    @Column(name = "patient_id")
    private Long id;

    @Column(name = "name_fld")
    private String name;

    @Column(name = "email_fld")
    private String email;

    @Column(name = "birth_date_fld")
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

    //more appointment OneToMany

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
