package tfc.grupo6.dam.model.persist.dao;

import java.util.List;

import tfc.grupo6.dam.model.entities.Enfermedad;

public interface EnfermedadDAO {
    Enfermedad save(Enfermedad enfermedad);
    void deleteById(int id);
    Enfermedad findById(int id);
    List<Enfermedad> findByNombre(String nombre);
    Enfermedad update(Enfermedad enfermedad);
}
