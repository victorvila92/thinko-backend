package com.thinko.thinkobackend.services;

import com.thinko.thinkobackend.domain.SessionPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SessionPeriodRepository extends JpaRepository<SessionPeriod, Long> {
    @Query(value = "SELECT * FROM session_period sp WHERE sp.organization_id = ?1 AND sp.cv_id = ?2 AND sp.course = ?3 ORDER BY sp.last_seen DESC LIMIT 1", nativeQuery = true)
    Optional<SessionPeriod> findCurrentSession(Long organization, Long cvId, Integer course);

    @Query(value = "SELECT * FROM session_period sp WHERE sp.organization_id = ?1 AND sp.cv_id = ?2 AND sp.course = ?3", nativeQuery = true)
    List<SessionPeriod> findAgenda(Long organization, Long cvId, Integer course);

    @Query(value = "SELECT * FROM session_period sp WHERE sp.organization_id = ?1 AND sp.cv_id = ?2 AND sp.course = ?3 AND sp.period_id = ?4", nativeQuery = true)
    List<SessionPeriod> findAgendaByPeriod(Long organization, Long cvId, Integer course, Integer periodId);

}
