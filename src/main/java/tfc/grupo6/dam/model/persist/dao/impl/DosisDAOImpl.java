package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Dosis;
import tfc.grupo6.dam.model.persist.dao.DosisDAO;
import tfc.grupo6.dam.model.persist.repository.DosisRepository;

import java.util.List;

@Repository
public class DosisDAOImpl implements DosisDAO {

    @Autowired
    private DosisRepository dosisRepository;

    @Override
    public Dosis save(Dosis dosis) {
        return dosisRepository.save(dosis);
    }

    @Override
    public void deleteById(int id) {
        dosisRepository.deleteById(id);
    }

    @Override
    public Dosis findById(int id) {
        return dosisRepository.findById(id).orElse(null);
    }

    @Override
    public List<Dosis> findByResidenteId(int residenteId) {
        return dosisRepository.findByResidenteId(residenteId);
    }

    @Override
    public List<Dosis> findByEmpleadoId(int empleadoId) {
        return dosisRepository.findByEmpleadoId(empleadoId);
    }

    @Override
    public Dosis update(Dosis dosis) {
        return dosisRepository.save(dosis);
    }
}
