package br.com.danilo.waypointmanagment.application.exceptions;

public class WaypointNotFoundException extends RuntimeException {
    public WaypointNotFoundException(Long id) {
        super("Outdoor not found with id: " + id);
    }
}
