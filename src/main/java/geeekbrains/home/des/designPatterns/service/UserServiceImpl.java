package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Appointment;
import geeekbrains.home.des.designPatterns.domain.User;
import geeekbrains.home.des.designPatterns.domain.UserRole;
import geeekbrains.home.des.designPatterns.jpa.AppointmentRepository;
import geeekbrains.home.des.designPatterns.jpa.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;

//    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
//        this.userDao = userDao;
//        this.passwordEncoder = passwordEncoder;
//    }


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        initDB();
    }

    private void initDB(){
        save(new User(null, "user1", "user1", "Какой то юзер 1", "user1@user1.ru", LocalDate.of(1994, 5, 10), UserRole.USER_ROLE, null));
        save(new User(null, "user2", "user2", "Какой то юзер 2", "user2@user2.ru", LocalDate.of(1995, 6, 11), UserRole.USER_ROLE, null));
        save(new User(null, "doctor2", "doctor2", "Какой то доктор 2", "doc2@doc2.ru", LocalDate.of(1986, 1, 6), UserRole.DOCTOR_ROLE, null));
        save(new User(null, "admin", "1qwertyuiop[]", "Главный администратор", "admin@admin.ru", LocalDate.of(0001, 1, 1), UserRole.ADMIN_ROLE, null));
        save(new User(null, "doctor1", "doctor1", "Какой то доктор 1", "doc1@doc1.ru", LocalDate.of(1996, 7, 12), UserRole.DOCTOR_ROLE, null));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getByRole(UserRole role) {
        List<User> list = userRepository.findByRole(role);
        System.out.println(list);
        return list;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void save(User user) {
        if (userRepository.findByLogin(user.getLogin()) != null){
//            throw new RuntimeException("User with login: " + user.getLogin() + " already exist");
            System.out.println("__________________________________________________________");
            System.out.println("User with login: " + user.getLogin() + " already exist");
            System.out.println("__________________________________________________________");
            return;
        }
        userRepository.save(user);
    }

    @Override
    public boolean update(User user) {
        if (user == null){
            throw new RuntimeException("Enter user update null");
        }
        userRepository.save(user);
        return true;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
