package hackacode.backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long idConsulta;
    @Getter @Setter
    private Date fechaYHora;
    @Getter @Setter
    private boolean pagado;
    @Getter @Setter
    private EstadoConsulta estado;
    @ManyToOne
    @JoinColumn(name = "idPaciente")
    @Getter @Setter
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "idPersona")
    @Getter @Setter
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "codServicio")
    private ServicioMedico servicio;
    @ManyToOne
    @JoinColumn(name = "codPaquete")
    private PaqueteServicios paquete;

    public Consulta(long idConsulta, Date fechaYHora, boolean pagado, EstadoConsulta estado, Paciente paciente,
            Medico medico, ServicioMedico servicio) {
        this.idConsulta = idConsulta;
        this.fechaYHora = fechaYHora;
        this.pagado = pagado;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.servicio = servicio;
    }

    public Consulta(long idConsulta, Date fechaYHora, boolean pagado, EstadoConsulta estado, Paciente paciente,
            Medico medico, PaqueteServicios paquete) {
        this.idConsulta = idConsulta;
        this.fechaYHora = fechaYHora;
        this.pagado = pagado;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.paquete = paquete;
    }

    public void setServicio(ServicioMedico servicioMedico){
        servicio = servicioMedico;
        paquete = null;
    }

    public void setPaquete(PaqueteServicios paqueteServicios){
        paquete = paqueteServicios;
        servicio = null;
    }

    public IServicio getServicio(){ // no sé si este sirve de algo, capaz si saco el getPaquete()
        if(servicio != null){
            return servicio;
        }
        return paquete;
    }

    public double getMontoTotal(){
        if (getServicio() == null){
            return 0;
        }
        if(paciente != null && paciente.isObraSocial()){
            return getServicio().getPrecio() * 0.8;
        }
        return getServicio().getPrecio();
    }
}
