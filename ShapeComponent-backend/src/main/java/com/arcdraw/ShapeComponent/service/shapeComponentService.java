package com.arcdraw.ShapeComponent.service;

import com.arcdraw.ShapeComponent.dto.ShapeComponentDto;

public interface shapeComponentService {
    ShapeComponentDto createshapeComponent(ShapeComponentDto shapecomponentdto);

    static ShapeComponentDto createShapeComponent(ShapeComponentDto shapecomponentdto) {
        return shapecomponentdto;
    }
}
