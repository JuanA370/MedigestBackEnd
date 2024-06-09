package tfc.grupo6.dam.model.persist.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import tfc.grupo6.dam.model.entities.Trata;

import java.util.List;

public interface TrataRepository extends JpaRepository<Trata, Integer> {
    List<Trata> findByEmpleadoId(int empleadoId);
}
