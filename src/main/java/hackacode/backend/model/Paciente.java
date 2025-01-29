package hackacode.backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Deian
 */
@Entity
@Getter @Setter @NoArgsConstructor
public class Paciente extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long idPaciente;
    private boolean obraSocial;

    public Paciente(long idPaciente, String nombre, String apellido, int dni, Date fechaNac, String email, String telefono,
            String direccion, boolean obraSocial) {
        super(nombre, apellido, dni, fechaNac, email, telefono, direccion);
        this.idPaciente = idPaciente;
        this.obraSocial = obraSocial;
    }
}
