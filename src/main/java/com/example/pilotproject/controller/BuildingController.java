package com.example.pilotproject.controller;

import com.example.pilotproject.model.dto.BuildingDto;
import com.example.pilotproject.model.entity.Building;
import com.example.pilotproject.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/buildings")
public class BuildingController {

    private final BuildingService buildingService;

    @PostMapping()
    public ResponseEntity<Building> createBuilding(@RequestBody BuildingDto building) {
        return new ResponseEntity(buildingService.saveBuilding(building), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Building> getBuildings(){
        return new ResponseEntity(buildingService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Building> getBuildingsById(@PathVariable Long id){
        return new ResponseEntity(buildingService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){
        buildingService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Building> update(@PathVariable Long id, @RequestBody BuildingDto dto){
        return new ResponseEntity(buildingService.update(id, dto), HttpStatus.OK);
    }

}
