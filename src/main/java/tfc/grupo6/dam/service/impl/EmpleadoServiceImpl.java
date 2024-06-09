package tfc.grupo6.dam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfc.grupo6.dam.model.entities.Empleado;
import tfc.grupo6.dam.model.persist.dao.EmpleadoDAO;
import tfc.grupo6.dam.service.EmpleadoService;

import java.util.List;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDAO empleadoDAO;

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoDAO.save(empleado);
    }

    @Override
    public void deleteById(int id) {
        empleadoDAO.deleteById(id);
    }

    @Override
    public Empleado findById(int id) {
        return empleadoDAO.findById(id);
    }

    @Override
    public List<Empleado> findByNombre(String nombre) {
        return empleadoDAO.findByNombre(nombre);
    }

    @Override
    public List<Empleado> findByEmail(String email) {
        return empleadoDAO.findByEmail(email);
    }

    @Override
    public Empleado update(Empleado empleado) {
        return empleadoDAO.update(empleado);
    }
}
