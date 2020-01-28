package com.demoprojects.conferencedemo.repositories;

import com.demoprojects.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
