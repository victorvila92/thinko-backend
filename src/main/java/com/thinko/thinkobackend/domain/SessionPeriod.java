package com.thinko.thinkobackend.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "session_period")
public class SessionPeriod {

    @Id
    private Long id;
    private String name;
    private Integer course;
    private Long cvId;
    private Long periodId;
    private Long organizationId;
    private String url;
    private Timestamp createdAt;
    private Timestamp lastSeen;

    public SessionPeriod() {

    }

    public SessionPeriod(Long id, String name, Integer course, Long cvId, Long periodId, Long organizationId, String url, Timestamp createdAt, Timestamp lastSeen) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.cvId = cvId;
        this.periodId = periodId;
        this.organizationId = organizationId;
        this.url = url;
        this.createdAt = createdAt;
        this.lastSeen = lastSeen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Long getCvId() {
        return cvId;
    }

    public void setCvId(Long cvId) {
        this.cvId = cvId;
    }

    public Long getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Long periodId) {
        this.periodId = periodId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
    }
}
