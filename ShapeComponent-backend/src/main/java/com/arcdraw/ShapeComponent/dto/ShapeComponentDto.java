package com.arcdraw.ShapeComponent.dto;

import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ShapeComponentDto {

    private long shape_id;
    private String name;
    private String type;
    private String shape_data;

}
