package hackacode.backend.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Deian
 */
@Entity
@Getter @Setter @NoArgsConstructor
public class Paciente extends Persona implements Serializable{
    private boolean obraSocial;

    public Paciente(long id, String nombre, String apellido, int dni, Date fechaNac, String email, String telefono,
            String direccion, boolean obraSocial) {
        super(id, nombre, apellido, dni, fechaNac, email, telefono, direccion);
        this.obraSocial = obraSocial;
    }
}
