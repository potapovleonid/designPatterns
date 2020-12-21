package geeekbrains.home.des.designPatterns.controller;

import geeekbrains.home.des.designPatterns.domain.UserRole;
import geeekbrains.home.des.designPatterns.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Добавить авторизацию только для user с ролью админа
    @GetMapping
    public String allUser(Model model){
        model.addAttribute("users", userService.getAll());
        return "users";
    }

    @GetMapping("/doctors")
    public String allDoctor(Model model){
//        System.out.println("Find all by: " + UserRole.DOCTOR_ROLE);
//        model.addAttribute("doctors", userService.getByRole(UserRole.DOCTOR_ROLE));
        model.addAttribute("doctors", userService.getAllDoctor());
        return "doctors";
    }



}
