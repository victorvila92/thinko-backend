package com.thinko.thinkobackend.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "organization")
public class Organization {

    private Long id;
    private String name;
    private String status;
    private String language;
    private Timestamp createdAt;

    public Organization(Long id, String name, String status, String language, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.language = language;
        this.createdAt = createdAt;
    }

    public Organization() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "language", nullable = false)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
