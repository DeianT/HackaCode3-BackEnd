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
import hackacode.backend.model.ServicioMedico;
import hackacode.backend.service.ServicioMedicoService;

@Repository
@CrossOrigin(origins = {""})
public class ServicioMedicoController {
    @Autowired
    private ServicioMedicoService service;

    @GetMapping("servicio/traer")
    @ResponseBody
    public List<ServicioMedico> traerServicioMedico(){
        return service.getServicioMedico();
    }
    
    @PostMapping("servicio/crear")
    public String crearServicioMedico(@RequestBody ServicioMedico servicio){
        service.saveServicioMedico(servicio);
        return "ServicioMedico creado";
    }
    
    @DeleteMapping("servicio/borrar/{id}")
    public String borrarServicioMedico(@PathVariable int id){
       service.deleteServicioMedico(id);
       return "ServicioMedico eliminado";
    }
    
    @PutMapping("servicio/editar")
    public ServicioMedico editarServicioMedico(@RequestBody ServicioMedico servicio)
    {
        ServicioMedico s = service.findServicioMedico(servicio.getCodServicio());
        
        if (s != null) {
            service.saveServicioMedico(servicio);
        }
                
        return s;
    }
}
