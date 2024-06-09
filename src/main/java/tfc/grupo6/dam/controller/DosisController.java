package tfc.grupo6.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tfc.grupo6.dam.model.entities.Dosis;
import tfc.grupo6.dam.service.DosisService;

import java.util.List;

@RestController
@RequestMapping("/dosis")
public class DosisController {

    @Autowired
    private DosisService dosisService;

    @PostMapping
    public ResponseEntity<Dosis> createDosis(@RequestBody Dosis dosis) {
        Dosis savedDosis = dosisService.save(dosis);
        return ResponseEntity.ok(savedDosis);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDosis(@PathVariable int id) {
        dosisService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dosis> getDosisById(@PathVariable int id) {
        Dosis dosis = dosisService.findById(id);
        return ResponseEntity.ok(dosis);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Dosis>> getDosisByResidenteId(@RequestParam int residenteId) {
        List<Dosis> dosisList = dosisService.findByResidenteId(residenteId);
        return ResponseEntity.ok(dosisList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dosis> updateDosis(@PathVariable int id, @RequestBody Dosis dosis) {
        dosis.setId(id);
        Dosis updatedDosis = dosisService.update(dosis);
        return ResponseEntity.ok(updatedDosis);
    }
}

