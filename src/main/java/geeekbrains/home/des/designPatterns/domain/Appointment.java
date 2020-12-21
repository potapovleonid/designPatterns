package geeekbrains.home.des.designPatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "appointment_tbl")
public class Appointment {

    private static final String SEQUANCE_NAME = "appointment_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUANCE_NAME)
    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
    @Column(name = "appointment_id")
    private Long id;

    @Column(name = "date_fld")
    private LocalDate date;

    @Column(name = "time_fld")
    private LocalTime time;

    //поразбираться
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "doctor_id")
    private Long doctorId;


}
