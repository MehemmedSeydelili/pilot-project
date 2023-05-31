package com.example.pilotproject.service;

import com.example.pilotproject.model.entity.POI;
import com.example.pilotproject.repository.POIRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class POIService {

    private final POIRepository repository;

    public POI addPoint(POI poi){
        return repository.save(poi);
    }

    public Optional<POI> getPointByİd(Long id){
        return repository.findById(id);
    }
}
