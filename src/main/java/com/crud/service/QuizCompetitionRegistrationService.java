package com.crud.service;

import java.util.List;
import com.crud.bean.QuizCompetitionRegistration;
import com.crud.dao.QuizCompetitionRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuizCompetitionRegistrationService {

    @Autowired
    private QuizCompetitionRegistrationRepository registrationRepository;

    public List<QuizCompetitionRegistration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public QuizCompetitionRegistration getRegistrationById(Long id) {
        return registrationRepository.findById(id).orElse(null);
    }

    public QuizCompetitionRegistration saveRegistration(QuizCompetitionRegistration registration) {
        return registrationRepository.save(registration);
    }

    public void deleteRegistrationById(Long id) {
        registrationRepository.deleteById(id);
    }
}
