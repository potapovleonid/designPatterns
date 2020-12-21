package geeekbrains.home.des.designPatterns.jpa;

import geeekbrains.home.des.designPatterns.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String name);
    List<User> findAllByRole(String role);
}
