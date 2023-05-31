package com.example.pilotproject.service;

import com.example.pilotproject.model.entity.Path;
import com.example.pilotproject.repository.PathRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PathService {

    private final PathRepository repository;

    public Path savePath(Path path){
        return repository.save(path);
    }
}
