package br.com.danilo.waypointmanagment.domain.entity;

import br.com.danilo.waypointmanagment.domain.entity.enums.Color;
import br.com.danilo.waypointmanagment.domain.entity.enums.WaypointColor;
import lombok.*;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Waypoint {
    private Long id;
    private String waypointName;
    private String description;
    private double latitude;
    private double longitude;
    private OffsetDateTime eventDate;
    private WaypointColor waypointColor;

}