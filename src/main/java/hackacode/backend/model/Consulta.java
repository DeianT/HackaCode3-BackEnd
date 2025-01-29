package hackacode.backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Medico medico;
    private IServicio servicio;
}
