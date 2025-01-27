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
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long idTurno;
    private Date fechaYHora;
    private int duracionMin;
    private Medico medico;
}
