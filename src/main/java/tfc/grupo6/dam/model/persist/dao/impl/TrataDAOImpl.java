package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Trata;
import tfc.grupo6.dam.model.persist.dao.TrataDAO;
import tfc.grupo6.dam.model.persist.repository.TrataRepository;

import java.util.List;

@Repository
public class TrataDAOImpl implements TrataDAO {

    @Autowired
    private TrataRepository trataRepository;

    @Override
    public Trata save(Trata trata) {
        return trataRepository.save(trata);
    }

    @Override
    public void deleteById(int id) {
        trataRepository.deleteById(id);
    }

    @Override
    public Trata findById(int id) {
        return trataRepository.findById(id).orElse(null);
    }

    @Override
    public List<Trata> findByEmpleadoId(int empleadoId) {
        return trataRepository.findByEmpleadoId(empleadoId);
    }

    @Override
    public Trata update(Trata trata) {
        return trataRepository.save(trata);
    }
}

