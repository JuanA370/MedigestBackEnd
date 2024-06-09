package tfc.grupo6.dam.service;

import java.util.List;

import tfc.grupo6.dam.model.entities.Residente;

public interface ResidenteService {
    Residente save(Residente residente);
    void deleteById(int id);
    Residente findById(int id);
    List<Residente> findByNombre(String nombre);
    Residente update(Residente residente);
}
