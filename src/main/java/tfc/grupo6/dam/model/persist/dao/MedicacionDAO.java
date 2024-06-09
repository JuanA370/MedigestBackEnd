package tfc.grupo6.dam.model.persist.dao;

import java.util.List;

import tfc.grupo6.dam.model.entities.Medicacion;

public interface MedicacionDAO {
    Medicacion save(Medicacion medicacion);
    void deleteById(int id);
    Medicacion findById(int id);
    List<Medicacion> findByNombre(String nombre);
    Medicacion update(Medicacion medicacion);
}
