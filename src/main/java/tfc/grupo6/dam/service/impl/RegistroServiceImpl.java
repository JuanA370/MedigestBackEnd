package tfc.grupo6.dam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfc.grupo6.dam.model.entities.Registro;
import tfc.grupo6.dam.model.persist.dao.RegistroDAO;
import tfc.grupo6.dam.service.RegistroService;

import java.util.List;

@Service
@Transactional
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private RegistroDAO registroDAO;

    @Override
    public Registro save(Registro registro) {
        return registroDAO.save(registro);
    }

    @Override
    public void deleteById(int id) {
        registroDAO.deleteById(id);
    }

    @Override
    public Registro findById(int id) {
        return registroDAO.findById(id);
    }

    @Override
    public List<Registro> findByEmpleadoId(int empleadoId) {
        return registroDAO.findByEmpleadoId(empleadoId);
    }

    @Override
    public Registro update(Registro registro) {
        return registroDAO.update(registro);
    }
}
