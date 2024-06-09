package tfc.grupo6.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tfc.grupo6.dam.model.entities.Medicacion;
import tfc.grupo6.dam.service.MedicacionService;

import java.util.List;

@RestController
@RequestMapping("/medicaciones")
public class MedicacionController {

    @Autowired
    private MedicacionService medicacionService;

    @PostMapping
    public ResponseEntity<Medicacion> createMedicacion(@RequestBody Medicacion medicacion) {
        Medicacion savedMedicacion = medicacionService.save(medicacion);
        return ResponseEntity.ok(savedMedicacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicacion(@PathVariable int id) {
        medicacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicacion> getMedicacionById(@PathVariable int id) {
        Medicacion medicacion = medicacionService.findById(id);

        return ResponseEntity.ok(medicacion);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Medicacion>> getMedicacionesByNombre(@RequestParam String nombre) {
        List<Medicacion> medicaciones = medicacionService.findByNombre(nombre);
        return ResponseEntity.ok(medicaciones);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicacion> updateMedicacion(@PathVariable int id, @RequestBody Medicacion medicacion) {
        medicacion.setId(id);
        Medicacion updatedMedicacion = medicacionService.update(medicacion);

        return ResponseEntity.ok(updatedMedicacion);
    }
}
