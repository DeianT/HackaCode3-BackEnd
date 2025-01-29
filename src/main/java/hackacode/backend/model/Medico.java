package hackacode.backend.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Deian
 */
@Entity
@Getter @Setter
public class Medico extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long idMedico;
    private String especialidad;
    private double sueldo;
    @OneToMany(mappedBy = "medico")
    private List<Turno> turnosDisponibles;

    public Medico() {
        turnosDisponibles = new ArrayList<>();
    }

    public Medico(long idMedico, String nombre, String apellido, int dni, Date fechaNac, String email, String telefono,
            String direccion, String especialidad, double sueldo, List<Turno> turnosDisponibles) {
        super(nombre, apellido, dni, fechaNac, email, telefono, direccion);
        this.idMedico = idMedico;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
        this.turnosDisponibles = turnosDisponibles;
    }

}
