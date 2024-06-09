package tfc.grupo6.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tfc.grupo6.dam.exception.exceptions.ResourceNotFoundException;
import tfc.grupo6.dam.model.entities.Residente;
import tfc.grupo6.dam.service.ResidenteService;

import java.util.List;

@RestController
@RequestMapping("/residentes")
public class ResidenteController {

    @Autowired
    private ResidenteService residenteService;

    @PostMapping
    public ResponseEntity<Residente> createResidente(@RequestBody Residente residente) {
        Residente savedResidente = residenteService.save(residente);
        return ResponseEntity.ok(savedResidente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResidente(@PathVariable int id) {
        residenteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Residente> getResidenteById(@PathVariable int id) {
        Residente residente = residenteService.findById(id);
        if (residente == null) {
            throw new ResourceNotFoundException("Residente not found with id " + id);
        }
        return ResponseEntity.ok(residente);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Residente>> getResidentesByNombre(@RequestParam String nombre) {
        List<Residente> residentes = residenteService.findByNombre(nombre);
        if (residentes.isEmpty()) {
            throw new ResourceNotFoundException("No Residentes found with name " + nombre);
        }
        return ResponseEntity.ok(residentes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Residente> updateResidente(@PathVariable int id, @RequestBody Residente residente) {
        residente.setId(id);
        Residente updatedResidente = residenteService.update(residente);
        if (updatedResidente == null) {
            throw new ResourceNotFoundException("Residente not found with id " + id);
        }
        return ResponseEntity.ok(updatedResidente);
    }
}
