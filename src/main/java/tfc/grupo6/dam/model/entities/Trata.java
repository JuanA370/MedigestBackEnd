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
@Table(name = "Trata")
public class Trata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_empleado", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "fk_residente", nullable = false)
    private Residente residente;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    private Date fechaFin;
}
