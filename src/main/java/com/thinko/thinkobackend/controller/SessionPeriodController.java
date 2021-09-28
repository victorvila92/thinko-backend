package com.thinko.thinkobackend.controller;

import com.thinko.thinkobackend.domain.SessionPeriod;
import com.thinko.thinkobackend.exceptions.ResourceNotFoundException;
import com.thinko.thinkobackend.services.SessionPeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sessionPeriod")
public class SessionPeriodController {

    @Autowired
    private SessionPeriodRepository periodSessionRepository;

    @GetMapping("/current/{organizationId}/{cvId}/{course}")
    public ResponseEntity<SessionPeriod> getCurrentSession(@PathVariable(value = "organizationId") Long organizationId, @PathVariable(value = "cvId") Long cvId, @PathVariable(value = "course") Integer course) throws ResourceNotFoundException {
        SessionPeriod currentSession = periodSessionRepository.findCurrentSession(organizationId, cvId, course).orElseThrow(() -> new ResourceNotFoundException("Current session not found."));
        return ResponseEntity.ok().body(currentSession);
    }

    @GetMapping("/agenda/{organizationId}/{cvId}/{course}")
    public ResponseEntity<List<SessionPeriod>> getAgenda(@PathVariable(value = "organizationId") Long organizationId, @PathVariable(value = "cvId") Long cvId, @PathVariable(value = "course") Integer course) throws ResourceNotFoundException {
        List<SessionPeriod> sessions = periodSessionRepository.findAgenda(organizationId, cvId, course);
        return ResponseEntity.ok().body(sessions);
    }

    @GetMapping("/agenda/{organizationId}/{cvId}/{course}/{periodId}")
    public ResponseEntity<List<SessionPeriod>> getAgendaByPeriod(@PathVariable(value = "organizationId") Long organizationId, @PathVariable(value = "cvId") Long cvId, @PathVariable(value = "course") Integer course, @PathVariable(value = "periodId") Integer periodId) throws ResourceNotFoundException {
        List<SessionPeriod> sessions = periodSessionRepository.findAgendaByPeriod(organizationId, cvId, course, periodId);
        return ResponseEntity.ok().body(sessions);
    }
}
