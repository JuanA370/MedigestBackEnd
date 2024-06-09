package tfc.grupo6.dam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tfc.grupo6.dam.model.entities.Residente;
import tfc.grupo6.dam.model.persist.dao.ResidenteDAO;
import tfc.grupo6.dam.service.ResidenteService;

import java.util.List;

@Service
@Transactional
public class ResidenteServiceImpl implements ResidenteService {

    @Autowired
    private ResidenteDAO residenteDAO;

    @Override
    public Residente save(Residente residente) {
        return residenteDAO.save(residente);
    }

    @Override
    public void deleteById(int id) {
        residenteDAO.deleteById(id);
    }

    @Override
    public Residente findById(int id) {
        return residenteDAO.findById(id);
    }

    @Override
    public List<Residente> findByNombre(String nombre) {
        return residenteDAO.findByNombre(nombre);
    }

    @Override
    public Residente update(Residente residente) {
        return residenteDAO.update(residente);
    }
}
