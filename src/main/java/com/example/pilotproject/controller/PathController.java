package com.example.pilotproject.controller;

import com.example.pilotproject.model.entity.Path;
import com.example.pilotproject.service.PathService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/path")
public class PathController {

    private final PathService service;

    @PostMapping
    public ResponseEntity<Path> savePath(@RequestBody Path path){
        return new ResponseEntity(service.savePath(path), HttpStatus.CREATED);
    }
}
