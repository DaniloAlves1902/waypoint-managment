package br.com.danilo.waypointmanagment.application.gateway;

import java.util.List;

public interface Gateway<T> {
    T save(T object);

    T update(T object);

    void delete(Long id);

    List<T> getAll();

    T getById(Long id);
}