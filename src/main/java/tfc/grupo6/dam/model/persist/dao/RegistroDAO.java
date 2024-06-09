package tfc.grupo6.dam.model.persist.dao;

import java.util.List;

import tfc.grupo6.dam.model.entities.Registro;

public interface RegistroDAO {
    Registro save(Registro registro);
    void deleteById(int id);
    Registro findById(int id);
    List<Registro> findByEmpleadoId(int empleadoId);
    Registro update(Registro registro);
}

