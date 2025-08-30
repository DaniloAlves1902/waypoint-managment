package br.com.danilo.waypointmanagment.domain.entity;

import br.com.danilo.waypointmanagment.domain.entity.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Waypoint {
    private Long id;
    private String waypointName;
    private String description;
    private double latitude;
    private double longitude;
    private OffsetDateTime eventDate;
    private Color waypointColor;

}