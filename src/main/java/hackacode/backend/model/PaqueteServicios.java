package hackacode.backend.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter  @AllArgsConstructor @NoArgsConstructor
public class PaqueteServicios implements IServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codPaquete;
    private ArrayList<ServicioMedico> listaServicios;

    public double getPrecio(){
        double precio = 0;
        for (ServicioMedico serv : listaServicios) {
            precio += serv.getPrecio();
        }
        return precio;
    }

    public int getDuracionAprox(){
        int duracion = 0;
        for (ServicioMedico serv : listaServicios) {
            duracion += serv.getDuracionAprox();
        }
        return duracion;
    }
}
