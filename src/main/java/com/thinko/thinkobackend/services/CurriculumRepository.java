package com.thinko.thinkobackend.services;

import com.thinko.thinkobackend.domain.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {

}
