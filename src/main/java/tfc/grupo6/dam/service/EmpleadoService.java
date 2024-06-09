package tfc.grupo6.dam.service;

import java.util.List;

import tfc.grupo6.dam.model.entities.Empleado;

public interface EmpleadoService {
    Empleado save(Empleado empleado);
    void deleteById(int id);
    Empleado findById(int id);
    List<Empleado> findByNombre(String nombre);
    List<Empleado> findByEmail(String email);
    Empleado update(Empleado empleado);
}
