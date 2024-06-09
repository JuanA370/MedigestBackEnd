package tfc.grupo6.dam.model.persist.dao;
import java.util.List;

import tfc.grupo6.dam.model.entities.Trata;

public interface TrataDAO {
    Trata save(Trata trata);
    void deleteById(int id);
    Trata findById(int id);
    List<Trata> findByEmpleadoId(int empleadoId);
    Trata update(Trata trata);
}
