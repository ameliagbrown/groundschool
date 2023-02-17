package com.starfireaviation.groundschool.model.repository;

import com.starfireaviation.groundschool.model.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}