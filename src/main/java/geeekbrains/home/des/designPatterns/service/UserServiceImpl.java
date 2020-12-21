package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.User;
import geeekbrains.home.des.designPatterns.domain.UserRole;
import geeekbrains.home.des.designPatterns.jpa.UserDao;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
//    private final PasswordEncoder passwordEncoder;

//    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
//        this.userDao = userDao;
//        this.passwordEncoder = passwordEncoder;
//    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        initDB();
    }

    private void initDB(){
        userDao.save(new User(null, "user1", "user1", "Какой то юзер 1", "user1@user1.ru", LocalDate.of(1994, 5, 10), UserRole.USER_ROLE, null));
        userDao.save(new User(null, "user2", "user2", "Какой то юзер 2", "user2@user2.ru", LocalDate.of(1995, 6, 11), UserRole.USER_ROLE, null));
        userDao.save(new User(null, "doctor1", "doctor1", "Какой то доктор 1", "doc1@doc1.ru", LocalDate.of(1996, 7, 12), UserRole.DOCTOR_ROLE, null));
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> getByRole(UserRole role) {
        return userDao.findByRole(role);
    }

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public boolean update(User user) {
        if (user == null){
            throw new RuntimeException("Enter user update null");
        }
        userDao.save(user);
        return true;
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}
