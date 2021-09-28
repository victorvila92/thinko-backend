package com.thinko.thinkobackend.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "curriculum")
public class Curriculum {

    private Long id;
    @Column(name = "organization_id", nullable = false)
    private Long organizationId;
    @Column(name = "cv_data")
    private String cvData;
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    public Curriculum(Long id, Long organizationId, String cvData, Timestamp createdAt) {
        this.id = id;
        this.organizationId = organizationId;
        this.cvData = cvData;
        this.createdAt = createdAt;
    }

    public Curriculum() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getCvData() {
        return cvData;
    }

    public void setCvData(String cvData) {
        this.cvData = cvData;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
