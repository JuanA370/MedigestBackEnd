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
@Table(name = "Registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_empleado", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "fk_dosis", nullable = false)
    private Dosis dosis;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSuministro;
}
