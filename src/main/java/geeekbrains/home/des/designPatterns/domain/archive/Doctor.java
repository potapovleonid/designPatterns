package geeekbrains.home.des.designPatterns.domain.archive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Data
//@Table(name = "doctor_tbl")
//public class Doctor {
//
//    private static final String SEQUANCE_NAME = "doctor_seq";
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUANCE_NAME)
//    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
//    @Column(name = "doctor_id")
//    private Long id;
//
//    @Column(name = "name_fld")
//    private String name;
//
//    @Column(name = "profession_tbl")
//    private String profession;
//
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    @MapsId
//    private User user;
//
//    //more appointment OneToMany
//
//}
