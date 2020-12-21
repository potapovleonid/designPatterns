package geeekbrains.home.des.designPatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Column(name = "role_fld")
    private UserRole role;

}
