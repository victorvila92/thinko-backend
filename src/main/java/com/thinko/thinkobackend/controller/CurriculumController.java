package com.thinko.thinkobackend.controller;

import com.thinko.thinkobackend.domain.Curriculum;
import com.thinko.thinkobackend.exceptions.ResourceNotFoundException;
import com.thinko.thinkobackend.services.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curriculum")
public class CurriculumController {

    @Autowired
    private CurriculumRepository curriculumRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Curriculum> getCurriculum(@PathVariable(value = "id") Long curriculumId)
            throws ResourceNotFoundException {
        Curriculum curriculum = curriculumRepository.findById(curriculumId)
                .orElseThrow(() -> new ResourceNotFoundException("Curriculum not found for this id :: " + curriculumId));
        return ResponseEntity.ok().body(curriculum);
    }
}
