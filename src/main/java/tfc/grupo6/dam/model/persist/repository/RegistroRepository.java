package tfc.grupo6.dam.model.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Registro;

import java.util.List;

public interface RegistroRepository extends JpaRepository<Registro, Integer> {
    List<Registro> findByEmpleadoId(int empleadoId);
}
