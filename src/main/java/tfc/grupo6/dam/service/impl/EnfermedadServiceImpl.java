package tfc.grupo6.dam.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfc.grupo6.dam.model.entities.Enfermedad;
import tfc.grupo6.dam.model.persist.dao.EnfermedadDAO;
import tfc.grupo6.dam.service.EnfermedadService;

import java.util.List;

@Service
@Transactional
public class EnfermedadServiceImpl implements EnfermedadService {

    @Autowired
    private EnfermedadDAO enfermedadDAO;

    @Override
    public Enfermedad save(Enfermedad enfermedad) {
        return enfermedadDAO.save(enfermedad);
    }

    @Override
    public void deleteById(int id) {
        enfermedadDAO.deleteById(id);
    }

    @Override
    public Enfermedad findById(int id) {
        return enfermedadDAO.findById(id);
    }

    @Override
    public List<Enfermedad> findByNombre(String nombre) {
        return enfermedadDAO.findByNombre(nombre);
    }

    @Override
    public Enfermedad update(Enfermedad enfermedad) {
        return enfermedadDAO.update(enfermedad);
    }
}
