package com.arcdraw.ShapeComponent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcdraw.ShapeComponent.dto.ShapeComponentDto;
import com.arcdraw.ShapeComponent.service.shapeComponentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/shape-components")
public class ShapeComponentController {

    private shapeComponentService shapecomponentservice;

    // Create a new shape component
    // Build Add Rest api
    @PostMapping
    public ResponseEntity<ShapeComponentDto>createShapeComponent(@RequestBody ShapeComponentDto shapecomponentdto)
    {
       ShapeComponentDto savedshapecomponentdto =  shapeComponentService.createShapeComponent(shapecomponentdto);
    return new ResponseEntity<>(savedshapecomponentdto, HttpStatus.CREATED);
    }

    
    
}
