package com.thinko.thinkobackend;

import com.thinko.thinkobackend.domain.Organization;
import com.thinko.thinkobackend.services.OrganizationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest(classes = ThinkoBackendApplication.class)
@AutoConfigureMockMvc
class OrganizationControllerTest {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Test
    void getOrganizationId() {
        Optional<Organization> result = organizationRepository.findById(1L);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(1, (long) result.get().getId());
    }

}
