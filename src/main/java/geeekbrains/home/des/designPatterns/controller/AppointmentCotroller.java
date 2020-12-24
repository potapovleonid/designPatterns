package geeekbrains.home.des.designPatterns.controller;

import geeekbrains.home.des.designPatterns.service.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("appointments")
public class AppointmentCotroller {

    private final AppointmentService appointmentService;

    public AppointmentCotroller(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }


    //??
    @GetMapping
    public String allAppointment(Model model){
        System.out.println(appointmentService.getAll());
        model.addAttribute("appointments", appointmentService.getAll());
        return "appointments";
    }

}
