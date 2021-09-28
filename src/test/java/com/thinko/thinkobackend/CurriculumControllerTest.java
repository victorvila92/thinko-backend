package com.thinko.thinkobackend;

import com.thinko.thinkobackend.domain.Curriculum;
import com.thinko.thinkobackend.services.CurriculumRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest(classes = ThinkoBackendApplication.class)
@AutoConfigureMockMvc
class CurriculumControllerTest {

    @Autowired
    private CurriculumRepository curriculumRepository;

    @Test
    void getOrganizationId() {
        Optional<Curriculum> result = curriculumRepository.findById(1L);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(1, (long) result.get().getId());
    }
}
