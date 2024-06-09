package tfc.grupo6.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tfc.grupo6.dam.model.entities.Enfermedad;
import tfc.grupo6.dam.service.EnfermedadService;

import java.util.List;

@RestController
@RequestMapping("/enfermedades")
public class EnfermedadController {

    @Autowired
    private EnfermedadService enfermedadService;

    @PostMapping
    public ResponseEntity<Enfermedad> createEnfermedad(@RequestBody Enfermedad enfermedad) {
        Enfermedad savedEnfermedad = enfermedadService.save(enfermedad);
        return ResponseEntity.ok(savedEnfermedad);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnfermedad(@PathVariable int id) {
        enfermedadService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enfermedad> getEnfermedadById(@PathVariable int id) {
        Enfermedad enfermedad = enfermedadService.findById(id);

        return ResponseEntity.ok(enfermedad);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Enfermedad>> getEnfermedadesByNombre(@RequestParam String nombre) {
        List<Enfermedad> enfermedades = enfermedadService.findByNombre(nombre);

        return ResponseEntity.ok(enfermedades);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Enfermedad> updateEnfermedad(@PathVariable int id, @RequestBody Enfermedad enfermedad) {
        enfermedad.setId(id);
        Enfermedad updatedEnfermedad = enfermedadService.update(enfermedad);

        return ResponseEntity.ok(updatedEnfermedad);
    }
}

