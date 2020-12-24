package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.User;
import geeekbrains.home.des.designPatterns.domain.UserRole;

import java.util.List;

public interface UserService {
    List<User> getAll();

    //не работает =_=
    List<User> getByRole(UserRole role);
//    List<User> getAllByRole(String role);
    User findByName(String name);
    void save(User user);
    boolean update(User user);
    User findById(Long id);
    void deleteById(Long id);
}
