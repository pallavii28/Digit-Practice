package com.crud.dao;

import com.crud.bean.QuizCompetitionRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizCompetitionRegistrationRepository extends JpaRepository<QuizCompetitionRegistration, Long> {
}