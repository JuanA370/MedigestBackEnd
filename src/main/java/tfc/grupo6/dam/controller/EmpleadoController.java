package tfc.grupo6.dam.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tfc.grupo6.dam.exception.exceptions.ResourceNotFoundException;
import tfc.grupo6.dam.model.entities.Empleado;
import tfc.grupo6.dam.service.EmpleadoService;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado) {
        Empleado savedEmpleado = empleadoService.save(empleado);
        return ResponseEntity.ok(savedEmpleado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable int id) {
        empleadoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable int id) {
        Empleado empleado = empleadoService.findById(id);
        if (empleado == null) {
            throw new ResourceNotFoundException("Empleado not found with id " + id);
        }
        return ResponseEntity.ok(empleado);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Empleado>> getEmpleadosByNombre(@RequestParam String nombre) {
        List<Empleado> empleados = empleadoService.findByNombre(nombre);
        if (empleados.isEmpty()) {
            throw new ResourceNotFoundException("No Empleados found with name " + nombre);
        }
        return ResponseEntity.ok(empleados);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado) {
        empleado.setId(id);
        Empleado updatedEmpleado = empleadoService.update(empleado);
        if (updatedEmpleado == null) {
            throw new ResourceNotFoundException("Empleado not found with id " + id);
        }
        return ResponseEntity.ok(updatedEmpleado);
    }
}

