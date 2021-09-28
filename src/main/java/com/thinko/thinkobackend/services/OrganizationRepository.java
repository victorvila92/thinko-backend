package com.thinko.thinkobackend.services;

import com.thinko.thinkobackend.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository  extends JpaRepository<Organization, Long> {

}
