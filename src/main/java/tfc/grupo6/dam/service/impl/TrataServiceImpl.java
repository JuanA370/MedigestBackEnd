package tfc.grupo6.dam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfc.grupo6.dam.model.entities.Trata;
import tfc.grupo6.dam.model.persist.dao.TrataDAO;
import tfc.grupo6.dam.service.TrataService;

import java.util.List;

@Service
@Transactional
public class TrataServiceImpl implements TrataService {

    @Autowired
    private TrataDAO trataDAO;

    @Override
    public Trata save(Trata trata) {
        return trataDAO.save(trata);
    }

    @Override
    public void deleteById(int id) {
        trataDAO.deleteById(id);
    }

    @Override
    public Trata findById(int id) {
        return trataDAO.findById(id);
    }

    @Override
    public List<Trata> findByEmpleadoId(int empleadoId) {
        return trataDAO.findByEmpleadoId(empleadoId);
    }

    @Override
    public Trata update(Trata trata) {
        return trataDAO.update(trata);
    }
}
