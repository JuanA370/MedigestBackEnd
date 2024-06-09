package tfc.grupo6.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tfc.grupo6.dam.model.entities.Registro;
import tfc.grupo6.dam.service.RegistroService;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping
    public ResponseEntity<Registro> createRegistro(@RequestBody Registro registro) {
        Registro savedRegistro = registroService.save(registro);
        return ResponseEntity.ok(savedRegistro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistro(@PathVariable int id) {
        registroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Registro> getRegistroById(@PathVariable int id) {
        Registro registro = registroService.findById(id);

        return ResponseEntity.ok(registro);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Registro>> getRegistrosByEmpleadoId(@RequestParam int empleadoId) {
        List<Registro> registroList = registroService.findByEmpleadoId(empleadoId);

        return ResponseEntity.ok(registroList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Registro> updateRegistro(@PathVariable int id, @RequestBody Registro registro) {
        registro.setId(id);
        Registro updatedRegistro = registroService.update(registro);

        return ResponseEntity.ok(updatedRegistro);
    }
}
