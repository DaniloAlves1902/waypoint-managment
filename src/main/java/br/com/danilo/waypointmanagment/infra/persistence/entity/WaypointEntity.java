package br.com.danilo.waypointmanagment.infra.persistence.entity;

import br.com.danilo.waypointmanagment.infra.persistence.entity.enums.Color;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "waypoints")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WaypointEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String waypointName;

    @NotBlank
    private String description;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    private OffsetDateTime eventDate;

    @Enumerated(EnumType.STRING)
    private Color waypointColor;
}
