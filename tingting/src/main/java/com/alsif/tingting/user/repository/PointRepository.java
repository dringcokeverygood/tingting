package com.alsif.tingting.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alsif.tingting.user.entity.Point;

@Repository
public interface PointRepository extends JpaRepository<Point, Long> {
}