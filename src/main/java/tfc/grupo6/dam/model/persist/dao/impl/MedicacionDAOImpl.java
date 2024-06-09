package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Medicacion;
import tfc.grupo6.dam.model.persist.dao.MedicacionDAO;
import tfc.grupo6.dam.model.persist.repository.MedicacionRepository;

import java.util.List;

@Repository
public class MedicacionDAOImpl implements MedicacionDAO {

    @Autowired
    private MedicacionRepository medicacionRepository;

    @Override
    public Medicacion save(Medicacion medicacion) {
        return medicacionRepository.save(medicacion);
    }

    @Override
    public void deleteById(int id) {
        medicacionRepository.deleteById(id);
    }

    @Override
    public Medicacion findById(int id) {
        return medicacionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medicacion> findByNombre(String nombre) {
        return medicacionRepository.findByNombre(nombre);
    }

    @Override
    public Medicacion update(Medicacion medicacion) {
        return medicacionRepository.save(medicacion);
    }
}
