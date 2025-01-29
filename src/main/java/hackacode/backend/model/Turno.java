package hackacode.backend.model;

import java.util.Date;

import hackacode.backend.dto.MedicoDTO;
import hackacode.backend.service.MedicoService;
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
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long idTurno;
    private Date fechaYHora;
    private int duracionMin;
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Medico medico;

    public Turno(long idMedico){
        this.medico =(new MedicoService().findMedico(idMedico));
    }

    public MedicoDTO getMedico(){//evita recursión infinita turno -> medico -> turno -> ...
        if (medico == null) {
            return null;
        }
        return new MedicoDTO(medico);
    }
}
