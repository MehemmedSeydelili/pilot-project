package com.example.pilotproject.service;

import com.example.pilotproject.model.dto.BuildingDto;
import com.example.pilotproject.model.entity.Building;
import com.example.pilotproject.repository.BuildingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BuildingService {

    Building buildings = new Building();
    private final BuildingRepository buildingRepository;

    public Building saveBuilding(BuildingDto building) {
        buildings.setName(building.getName());
        buildings.setLocation(building.getLocationDto());
        return buildingRepository.save(buildings);
    }

    public List<Building> getAll() {
        return buildingRepository.findAll();
    }

    public Optional<Building> getById(Long id) {
        return Optional.ofNullable(buildingRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Building not found")));
    }

    public void delete(Long id) {
        buildingRepository.deleteById(id);
    }

    public Building update(Long id, BuildingDto building) {

        Building build = buildingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Building not found"));

        build.setName(building.getName());
        build.setLocation(building.getLocationDto());
        return buildingRepository.save(build);
    }
}
