package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Enfermedad;
import tfc.grupo6.dam.model.persist.dao.EnfermedadDAO;
import tfc.grupo6.dam.model.persist.repository.EnfermedadRepository;

import java.util.List;

@Repository
public class EnfermedadDAOImpl implements EnfermedadDAO {

    @Autowired
    private EnfermedadRepository enfermedadRepository;

    @Override
    public Enfermedad save(Enfermedad enfermedad) {
        return enfermedadRepository.save(enfermedad);
    }

    @Override
    public void deleteById(int id) {
        enfermedadRepository.deleteById(id);
    }

    @Override
    public Enfermedad findById(int id) {
        return enfermedadRepository.findById(id).orElse(null);
    }

    @Override
    public List<Enfermedad> findByNombre(String nombre) {
        return enfermedadRepository.findByNombre(nombre);
    }

    @Override
    public Enfermedad update(Enfermedad enfermedad) {
        return enfermedadRepository.save(enfermedad);
    }
}
