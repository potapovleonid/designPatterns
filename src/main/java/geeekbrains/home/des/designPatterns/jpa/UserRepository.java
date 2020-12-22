package geeekbrains.home.des.designPatterns.jpa;

import geeekbrains.home.des.designPatterns.domain.User;
import geeekbrains.home.des.designPatterns.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    //поиск по роли не работает
    List<User> findByRole(UserRole role);
//    List<User> findAllByRole(String role);
}
