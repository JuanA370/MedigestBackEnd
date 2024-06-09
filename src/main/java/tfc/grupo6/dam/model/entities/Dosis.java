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
@Table(name = "Dosis")
public class Dosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_residente", nullable = false)
    private Residente residente;

    @ManyToOne
    @JoinColumn(name = "fk_medicacion", nullable = false)
    private Medicacion medicacion;

    @ManyToOne
    @JoinColumn(name = "fk_empleado", nullable = false)
    private Empleado empleado;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false, length = 50)
    private String diasSemana;

    @Column(nullable = false, length = 50)
    private String horasDeseadas;

    @Column(nullable = false)
    private boolean cronico;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date inicioTratamiento;

    @Temporal(TemporalType.DATE)
    private Date finTratamiento;
}
