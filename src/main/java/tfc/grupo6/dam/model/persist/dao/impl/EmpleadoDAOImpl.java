package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Empleado;
import tfc.grupo6.dam.model.persist.dao.EmpleadoDAO;
import tfc.grupo6.dam.model.persist.repository.EmpleadoRepository;

import java.util.List;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deleteById(int id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public Empleado findById(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Empleado> findByNombre(String nombre) {
        return empleadoRepository.findByNombre(nombre);
    }

    @Override
    public List<Empleado> findByEmail(String email) {
        return empleadoRepository.findByEmail(email);
    }

    @Override
    public Empleado update(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
