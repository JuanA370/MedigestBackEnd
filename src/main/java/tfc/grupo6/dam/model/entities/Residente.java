package tfc.grupo6.dam.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Residente")
public class Residente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private int numHabitacion;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
}
