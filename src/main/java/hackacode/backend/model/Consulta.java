package hackacode.backend.model;

import java.util.Date;

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
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idConsulta;
    private Date fechaYHora;
    private double montoTotal;
    private boolean pagado;
    private EstadoConsulta estado;
    private Paciente paciente;
    private Medico medico;
    private IServicio servicio;
}
