package com.example.pilotproject.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.geolatte.geom.Geometry;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paths")
public class Path {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path", columnDefinition = "geometry(Point,4326)")
    private Geometry path;
}
