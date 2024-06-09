package tfc.grupo6.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tfc.grupo6.dam.model.entities.Trata;
import tfc.grupo6.dam.service.TrataService;

import java.util.List;

@RestController
@RequestMapping("/trata")
public class TrataController {

    @Autowired
    private TrataService trataService;

    @PostMapping
    public ResponseEntity<Trata> createTrata(@RequestBody Trata trata) {
        Trata savedTrata = trataService.save(trata);
        return ResponseEntity.ok(savedTrata);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrata(@PathVariable int id) {
        trataService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trata> getTrataById(@PathVariable int id) {
        Trata trata = trataService.findById(id);

        return ResponseEntity.ok(trata);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Trata>> getTrataByEmpleadoId(@RequestParam int empleadoId) {
        List<Trata> trataList = trataService.findByEmpleadoId(empleadoId);

        return ResponseEntity.ok(trataList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trata> updateTrata(@PathVariable int id, @RequestBody Trata trata) {
        trata.setId(id);
        Trata updatedTrata = trataService.update(trata);

        return ResponseEntity.ok(updatedTrata);
    }
}
