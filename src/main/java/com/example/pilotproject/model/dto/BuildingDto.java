package com.example.pilotproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.geojson.Geometry;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingDto {

    private String name;
    private Geometry locationDto;

}
