package geeekbrains.home.des.designPatterns.service;

import geeekbrains.home.des.designPatterns.domain.Appointment;
import geeekbrains.home.des.designPatterns.domain.User;
import geeekbrains.home.des.designPatterns.jpa.AppointmentRepository;
import geeekbrains.home.des.designPatterns.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    private final AppointmentRepository appointmentRepository;
    private final UserRepository userRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, UserRepository userRepository) {
        this.appointmentRepository = appointmentRepository;
        this.userRepository = userRepository;
        initDb();
    }

    private void initDb(){
//        appointmentRepository.save(new Appointment(null, LocalDate.of(2020, 12, 30), LocalTime.of(8, 30), userRepository.findById(1L).orElse(null), 3L));
//        appointmentRepository.save(new Appointment(null, LocalDate.of(2020, 12, 31), LocalTime.of(8, 30), userRepository.findById(2L).orElse(null), 4L));
        createAppointment(userRepository.findById(1L).orElse(null), userRepository.findById(3L).orElse(null), LocalDate.of(2020, 12, 30), LocalTime.of(8, 30));
        createAppointment(userRepository.findById(2L).orElse(null), userRepository.findById(4L).orElse(null), LocalDate.of(2020, 12, 31), LocalTime.of(8, 30));
    }


    public Appointment createAppointment(User patient, User doctor, LocalDate date, LocalTime time){
        Appointment app = Appointment.builder()
                .id(null)
                .user(patient)
                .doctorId(doctor.getId())
                .date(date)
                .time(time)
                .build();
//        patient.addAppointment(app);
        return appointmentRepository.save(app);
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    //добавить
    @Override
    public List<Appointment> getAllForDoctor(Long doctorId) {
        return null;
    }
    @Override
    public List<Appointment> getAllForPatient(Long patientId) {
        return null;
    }
    //

    @Override
    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public boolean update(Appointment appointment) {
        if (appointment == null){
            throw new RuntimeException("Enter appointment for update null");
        }
        appointmentRepository.save(appointment);
        return true;
    }
}
