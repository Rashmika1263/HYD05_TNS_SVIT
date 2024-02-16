package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Placement;

@Repository
public interface PlacementRepository extends JpaRepository <Placement, Long> {
}
