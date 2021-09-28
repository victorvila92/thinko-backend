package com.thinko.thinkobackend;

import com.thinko.thinkobackend.domain.SessionPeriod;
import com.thinko.thinkobackend.services.SessionPeriodRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = ThinkoBackendApplication.class)
@AutoConfigureMockMvc
class SessionPeriodControllerTest {

    @Autowired
    private SessionPeriodRepository sessionPeriodRepository;

    @Test
    void findCurrentSession() {
        Optional<SessionPeriod> result = sessionPeriodRepository.findCurrentSession(1L, 1L, 1);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(1, (long) result.get().getOrganizationId());
        Assertions.assertEquals(1, (long) result.get().getCvId());
        Assertions.assertEquals(1, result.get().getCourse());

    }

    @Test
    void findAgenda() {
        List<SessionPeriod> result = sessionPeriodRepository.findAgenda(1L, 1L, 1);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertTrue(result.stream().allMatch(node -> node.getOrganizationId().equals((long) 1)));
        Assertions.assertTrue(result.stream().allMatch(node -> node.getCvId().equals((long) 1)));
        Assertions.assertTrue(result.stream().allMatch(node -> node.getCourse().equals(1)));
    }

    @Test
    void findAgendaByPeriod() {
        List<SessionPeriod> result = sessionPeriodRepository.findAgendaByPeriod(1L, 1L, 1, 2);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertTrue(result.stream().allMatch(node -> node.getOrganizationId().equals((long) 1)));
        Assertions.assertTrue(result.stream().allMatch(node -> node.getCvId().equals((long) 1)));
        Assertions.assertTrue(result.stream().allMatch(node -> node.getCourse().equals(1)));
        Assertions.assertTrue(result.stream().allMatch(node -> node.getPeriodId().equals((long) 2)));
    }

}
