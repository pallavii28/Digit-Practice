package com.crud.controller;

import java.util.List;
import com.crud.bean.QuizCompetitionRegistration;
import com.crud.service.QuizCompetitionRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/quiz-registrations")
public class QuizCompetitionRegistrationController {

    @Autowired
    private QuizCompetitionRegistrationService registrationService;

    @GetMapping("/")
    public List<QuizCompetitionRegistration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public QuizCompetitionRegistration getRegistrationById(@PathVariable Long id) {
        return registrationService.getRegistrationById(id);
    }

    @PostMapping("/")
    public QuizCompetitionRegistration saveRegistration(@RequestBody QuizCompetitionRegistration registration) {
        return registrationService.saveRegistration(registration);
    }

    @PutMapping("/{id}")
    public QuizCompetitionRegistration updateRegistration(@PathVariable Long id, @RequestBody QuizCompetitionRegistration registration) {
        QuizCompetitionRegistration existingRegistration = registrationService.getRegistrationById(id);
        if (existingRegistration != null) {
            existingRegistration.setName(registration.getName());
            existingRegistration.setEmail(registration.getEmail());
            existingRegistration.setPhone(registration.getPhone());
            return registrationService.saveRegistration(existingRegistration);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteRegistrationById(@PathVariable Long id) {
        registrationService.deleteRegistrationById(id);
    }
}