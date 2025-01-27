package hackacode.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
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
public class Medico extends Persona implements Serializable{
    private String especialidad;
    private double sueldo;
    private ArrayList<Turno> turnosDisponibles;

    public Medico(long id, String nombre, String apellido, int dni, Date fechaNac, String email, String telefono,
            String direccion, String especialidad, double sueldo, ArrayList<Turno> turnosDisponibles) {
        super(id, nombre, apellido, dni, fechaNac, email, telefono, direccion);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
        this.turnosDisponibles = turnosDisponibles;
    }

}
