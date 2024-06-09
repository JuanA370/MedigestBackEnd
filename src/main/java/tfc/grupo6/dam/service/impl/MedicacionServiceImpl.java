package tfc.grupo6.dam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfc.grupo6.dam.model.entities.Medicacion;
import tfc.grupo6.dam.model.persist.dao.MedicacionDAO;
import tfc.grupo6.dam.service.MedicacionService;

import java.util.List;

@Service
@Transactional
public class MedicacionServiceImpl implements MedicacionService {

    @Autowired
    private MedicacionDAO medicacionDAO;

    @Override
    public Medicacion save(Medicacion medicacion) {
        return medicacionDAO.save(medicacion);
    }

    @Override
    public void deleteById(int id) {
        medicacionDAO.deleteById(id);
    }

    @Override
    public Medicacion findById(int id) {
        return medicacionDAO.findById(id);
    }

    @Override
    public List<Medicacion> findByNombre(String nombre) {
        return medicacionDAO.findByNombre(nombre);
    }

    @Override
    public Medicacion update(Medicacion medicacion) {
        return medicacionDAO.update(medicacion);
    }
}
