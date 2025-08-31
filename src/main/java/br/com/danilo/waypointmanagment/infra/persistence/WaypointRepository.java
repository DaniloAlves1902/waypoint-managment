package br.com.danilo.waypointmanagment.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WaypointRepository extends JpaRepository<WaypointRepository, Long> {
}
