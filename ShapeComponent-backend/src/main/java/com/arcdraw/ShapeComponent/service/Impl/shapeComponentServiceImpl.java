package com.arcdraw.ShapeComponent.service.Impl;

import org.springframework.stereotype.Service;

import com.arcdraw.ShapeComponent.dto.ShapeComponentDto;
import com.arcdraw.ShapeComponent.entity.shapeComponent;
import com.arcdraw.ShapeComponent.mapper.ShapeComponentMapper;
import com.arcdraw.ShapeComponent.repository.ShapeComponentRepository;
import com.arcdraw.ShapeComponent.service.shapeComponentService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class shapeComponentServiceImpl implements shapeComponentService {

    private ShapeComponentRepository shapecomponentrepositrory;

    @Override
    public ShapeComponentDto createshapeComponent(ShapeComponentDto shapecomponentdto) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createshapeComponent'")

        shapeComponent shapecomponent = ShapeComponentMapper.mapToshapeComponent(shapecomponentdto);
        shapeComponent shapecomponentsaved = shapecomponentrepositrory.save(shapecomponent);
        return ShapeComponentMapper.mapToShapeComponentDto(shapecomponentsaved);
    }
    
}
