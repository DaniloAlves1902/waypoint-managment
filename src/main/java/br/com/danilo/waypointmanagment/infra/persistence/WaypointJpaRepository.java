package br.com.danilo.waypointmanagment.infra.persistence;

import br.com.danilo.waypointmanagment.infra.persistence.entity.WaypointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaypointJpaRepository extends JpaRepository<WaypointEntity, Long> {
}
