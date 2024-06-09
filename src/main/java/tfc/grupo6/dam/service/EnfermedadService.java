package tfc.grupo6.dam.service;

import java.util.List;

import tfc.grupo6.dam.model.entities.Enfermedad;

public interface EnfermedadService {
    Enfermedad save(Enfermedad enfermedad);
    void deleteById(int id);
    Enfermedad findById(int id);
    List<Enfermedad> findByNombre(String nombre);
    Enfermedad update(Enfermedad enfermedad);
}
