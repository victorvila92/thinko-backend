package com.thinko.thinkobackend.controller;

import com.thinko.thinkobackend.domain.Organization;
import com.thinko.thinkobackend.exceptions.ResourceNotFoundException;
import com.thinko.thinkobackend.services.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    private OrganizationRepository organizationRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getOrganization(@PathVariable(value = "id") Long organizationId)
            throws ResourceNotFoundException {
        Organization organization = organizationRepository.findById(organizationId)
                .orElseThrow(() -> new ResourceNotFoundException("Organization not found for this id :: " + organizationId));
        return ResponseEntity.ok().body(organization);
    }
}
