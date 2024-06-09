package tfc.grupo6.dam.model.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Enfermedad;

import java.util.List;

public interface EnfermedadRepository extends JpaRepository<Enfermedad, Integer> {
    List<Enfermedad> findByNombre(String nombre);
}
