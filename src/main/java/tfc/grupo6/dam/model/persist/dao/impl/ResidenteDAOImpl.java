package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Residente;
import tfc.grupo6.dam.model.persist.dao.ResidenteDAO;
import tfc.grupo6.dam.model.persist.repository.ResidenteRepository;

import java.util.List;

@Repository
public class ResidenteDAOImpl implements ResidenteDAO {

    @Autowired
    private ResidenteRepository residenteRepository;

    @Override
    public Residente save(Residente residente) {
        return residenteRepository.save(residente);
    }

    @Override
    public void deleteById(int id) {
        residenteRepository.deleteById(id);
    }

    @Override
    public Residente findById(int id) {
        return residenteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Residente> findByNombre(String nombre) {
        return residenteRepository.findByNombre(nombre);
    }

    @Override
    public Residente update(Residente residente) {
        return residenteRepository.save(residente);
    }
}
