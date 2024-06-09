package tfc.grupo6.dam.model.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Empleado;
import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    List<Empleado> findByNombre(String nombre);
    List<Empleado> findByEmail(String email);
}
