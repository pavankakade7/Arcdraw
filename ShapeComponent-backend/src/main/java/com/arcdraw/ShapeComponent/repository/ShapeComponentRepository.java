package com.arcdraw.ShapeComponent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arcdraw.ShapeComponent.entity.shapeComponent;

public interface ShapeComponentRepository extends JpaRepository<shapeComponent, Long> {
    
}
