package hackacode.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ServicioMedico implements IServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codServicio;
    private String nombre;
    private String descripcion;
    private double precio;
    private int duracionAprox;
}
