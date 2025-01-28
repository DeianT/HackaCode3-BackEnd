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
import hackacode.backend.model.Paciente;
import hackacode.backend.service.PacienteService;

@Repository
@CrossOrigin(origins = {""})
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping("paciente/traer")
    @ResponseBody
    public List<Paciente> traerPaciente(){
        return service.getPaciente();
    }
    
    @PostMapping("paciente/crear")
    public String crearPaciente(@RequestBody Paciente paciente){
        service.savePaciente(paciente);
        return "Paciente creado";
    }
    
    @DeleteMapping("paciente/borrar/{id}")
    public String borrarPaciente(@PathVariable int id){
       service.deletePaciente(id);
       return "Paciente eliminado";
    }
    
    @PutMapping("paciente/editar")
    public Paciente editarPaciente(@RequestBody Paciente paciente)
    {
        Paciente p = service.findPaciente(paciente.getIdPersona());
        
        if (p != null) {
            service.savePaciente(paciente);
        }
                
        return p;
    }
}
