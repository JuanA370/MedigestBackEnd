package tfc.grupo6.dam.service;

import java.util.List;

import tfc.grupo6.dam.model.entities.Registro;

public interface RegistroService {
    Registro save(Registro registro);
    void deleteById(int id);
    Registro findById(int id);
    List<Registro> findByEmpleadoId(int empleadoId);
    Registro update(Registro registro);
}

