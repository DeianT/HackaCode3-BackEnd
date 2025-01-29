package hackacode.backend.model;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Deian
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @MappedSuperclass
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected Date fechaNac;
    protected String email;
    protected String telefono;
    protected String direccion;
}
