package br.com.danilo.waypointmanagment.infra.mapper;

import br.com.danilo.waypointmanagment.domain.entity.Waypoint;
import br.com.danilo.waypointmanagment.domain.entity.enums.WaypointColor;
import br.com.danilo.waypointmanagment.infra.persistence.entity.WaypointEntity;
import br.com.danilo.waypointmanagment.infra.persistence.entity.enums.WaypointColorEntity;

public class WaypointMapper {

    public static Waypoint toDomain(WaypointEntity entity) {
        if (entity == null) return null;

        return Waypoint.builder()
                .id(entity.getId())
                .waypointName(entity.getWaypointName())
                .description(entity.getDescription())
                .eventDate(entity.getEventDate())
                .longitude(entity.getLongitude())
                .latitude(entity.getLatitude())
                .waypointColor(WaypointColor.valueOf(entity.getWaypointWaypointColorEntity().name()))
                .build();
    }

    public static WaypointEntity toEntity(Waypoint domain) {
        if (domain == null) return null;

        return WaypointEntity.builder()
                .id(domain.getId())
                .waypointName(domain.getWaypointName())
                .description(domain.getDescription())
                .eventDate(domain.getEventDate())
                .longitude(domain.getLongitude())
                .latitude(domain.getLatitude())
                .waypointWaypointColorEntity(WaypointColorEntity.valueOf(domain.getWaypointColor().name()))
                .build();
    }
}
