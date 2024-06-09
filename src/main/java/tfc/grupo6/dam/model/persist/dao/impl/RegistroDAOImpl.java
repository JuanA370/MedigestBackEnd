package tfc.grupo6.dam.model.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tfc.grupo6.dam.model.entities.Registro;
import tfc.grupo6.dam.model.persist.dao.RegistroDAO;
import tfc.grupo6.dam.model.persist.repository.RegistroRepository;

import java.util.List;

@Repository
public class RegistroDAOImpl implements RegistroDAO {

    @Autowired
    private RegistroRepository registroRepository;

    @Override
    public Registro save(Registro registro) {
        return registroRepository.save(registro);
    }

    @Override
    public void deleteById(int id) {
        registroRepository.deleteById(id);
    }

    @Override
    public Registro findById(int id) {
        return registroRepository.findById(id).orElse(null);
    }

    @Override
    public List<Registro> findByEmpleadoId(int empleadoId) {
        return registroRepository.findByEmpleadoId(empleadoId);
    }

    @Override
    public Registro update(Registro registro) {
        return registroRepository.save(registro);
    }
}
