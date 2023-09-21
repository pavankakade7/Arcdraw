package com.arcdraw.ShapeComponent.mapper;

import com.arcdraw.ShapeComponent.dto.ShapeComponentDto;
import com.arcdraw.ShapeComponent.entity.shapeComponent;

public class ShapeComponentMapper {

    public static ShapeComponentDto mapToShapeComponentDto(shapeComponent shapecomponent) {

        return new ShapeComponentDto(
                shapecomponent.getShape_id(),
                shapecomponent.getName(),
                shapecomponent.getType(),
                shapecomponent.getShape_data()
        );

    }

    public static shapeComponent mapToshapeComponent(ShapeComponentDto shapecomponentdto) {
        return new shapeComponent(
                shapecomponentdto.getShape_id(),
                shapecomponentdto.getName(),
                shapecomponentdto.getType(),
                shapecomponentdto.getShape_data());
    }
}
