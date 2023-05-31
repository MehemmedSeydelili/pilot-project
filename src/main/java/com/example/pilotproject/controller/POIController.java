package com.example.pilotproject.controller;

import com.example.pilotproject.model.entity.POI;
import com.example.pilotproject.service.POIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/point")
public class POIController {

    private final POIService service;

    @PostMapping
    public POI addPoint(@RequestBody POI poi){
        return service.addPoint(poi);
    }

    @GetMapping("/{id}")
    public Optional<POI> getPoint(@PathVariable Long id){
        return service.getPointByİd(id);
    }
}
