package hackacode.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import hackacode.backend.model.Medico;
import hackacode.backend.service.MedicoService;

@RestController
@CrossOrigin(origins = {""})
public class MedicoController {
    @Autowired
    private MedicoService service;

    @GetMapping("medico/traer")
    @ResponseBody
    public List<Medico> traerMedico(){
        return service.getMedico();
    }
    
    @PostMapping("medico/crear")
    public String crearMedico(@RequestBody Medico medico){
        service.saveMedico(medico);
        return "Medico creado";
    }
    
    @DeleteMapping("medico/borrar/{id}")
    public String borrarMedico(@PathVariable int id){
       service.deleteMedico(id);
       return "Medico eliminado";
    }
    
    @PutMapping("medico/editar")
    public Medico editarMedico(@RequestBody Medico medico)
    {
        Medico m = service.findMedico(medico.getIdPersona());
        
        if (m != null) {
            service.saveMedico(medico);
        }
                
        return m;
    }
}
