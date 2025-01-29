package hackacode.backend.dto;

import hackacode.backend.model.Medico;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MedicoDTO {
    private long idPersona;
    private String nombre;
    private String apellido;
    private int dni;
    private String especialidad;

    public MedicoDTO(Medico medico){
        idPersona = medico.getIdMedico();
        nombre = medico.getNombre();
        apellido = medico.getApellido();
        dni = medico.getDni();
        especialidad = medico.getEspecialidad();
    }
}
