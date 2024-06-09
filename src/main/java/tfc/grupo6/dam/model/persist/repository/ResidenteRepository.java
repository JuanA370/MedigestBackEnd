package tfc.grupo6.dam.model.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Residente;

import java.util.List;

public interface ResidenteRepository extends JpaRepository<Residente, Integer> {
    List<Residente> findByNombre(String nombre);
}