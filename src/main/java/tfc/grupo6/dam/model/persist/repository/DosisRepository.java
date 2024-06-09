package tfc.grupo6.dam.model.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Dosis;

import java.util.List;

public interface DosisRepository extends JpaRepository<Dosis, Integer> {
    List<Dosis> findByResidenteId(int residenteId);
    List<Dosis> findByEmpleadoId(int empleadoId);
}
