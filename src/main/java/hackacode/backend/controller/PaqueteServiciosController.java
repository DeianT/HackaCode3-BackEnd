package hackacode.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import hackacode.backend.model.PaqueteServicios;
import hackacode.backend.service.PaqueteServiciosService;

@Repository
@CrossOrigin(origins = {""})
public class PaqueteServiciosController {
    @Autowired
    private PaqueteServiciosService service;

    @GetMapping("paquete/traer")
    @ResponseBody
    public List<PaqueteServicios> traerPaqueteServicios(){
        return service.getPaqueteServicios();
    }
    
    @PostMapping("paquete/crear")
    public String crearPaqueteServicios(@RequestBody PaqueteServicios paquete){
        service.savePaqueteServicios(paquete);
        return "PaqueteServicios creado";
    }
    
    @DeleteMapping("paquete/borrar/{id}")
    public String borrarPaqueteServicios(@PathVariable int id){
       service.deletePaqueteServicios(id);
       return "PaqueteServicios eliminado";
    }
    
    @PutMapping("paquete/editar")
    public PaqueteServicios editarPaqueteServicios(@RequestBody PaqueteServicios paquete)
    {
        PaqueteServicios p = service.findPaqueteServicios(paquete.getCodPaquete());
        
        if (p != null) {
            service.savePaqueteServicios(paquete);
        }
                
        return p;
    }
}
