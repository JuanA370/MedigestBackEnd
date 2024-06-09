package tfc.grupo6.dam.model.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Medicacion;

import java.util.List;

public interface MedicacionRepository extends JpaRepository<Medicacion, Integer> {
    List<Medicacion> findByNombre(String nombre);
}
