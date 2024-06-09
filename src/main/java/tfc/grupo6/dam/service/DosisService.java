package tfc.grupo6.dam.service;

import java.util.List;

import tfc.grupo6.dam.model.entities.Dosis;

public interface DosisService {
    Dosis save(Dosis dosis);
    void deleteById(int id);
    Dosis findById(int id);
    List<Dosis> findByResidenteId(int residenteId);
    List<Dosis> findByEmpleadoId(int empleadoId);
    Dosis update(Dosis dosis);
}
