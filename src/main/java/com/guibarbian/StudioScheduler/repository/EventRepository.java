package com.guibarbian.StudioScheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guibarbian.StudioScheduler.models.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
    
}
