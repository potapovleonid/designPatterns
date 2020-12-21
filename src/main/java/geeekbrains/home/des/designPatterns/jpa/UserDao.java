package geeekbrains.home.des.designPatterns.jpa;

import geeekbrains.home.des.designPatterns.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
