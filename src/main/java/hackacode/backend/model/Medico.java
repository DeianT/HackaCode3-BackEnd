package hackacode.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Deian
 */
@Entity
@Getter @Setter
public class Medico extends Persona implements Serializable{
    private String especialidad;
    private double sueldo;
    @OneToMany(mappedBy = "medico")
    private List<Turno> turnosDisponibles;

    public Medico() {
        turnosDisponibles = new ArrayList<>();
    }

    public Medico(long id, String nombre, String apellido, int dni, Date fechaNac, String email, String telefono,
            String direccion, String especialidad, double sueldo, List<Turno> turnosDisponibles) {
        super(id, nombre, apellido, dni, fechaNac, email, telefono, direccion);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
        this.turnosDisponibles = turnosDisponibles;
    }

}
