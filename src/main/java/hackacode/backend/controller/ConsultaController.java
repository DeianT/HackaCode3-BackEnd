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

import hackacode.backend.model.Consulta;
import hackacode.backend.service.ConsultaService;

@RestController
@CrossOrigin(origins = {""})
public class ConsultaController {
    @Autowired
    private ConsultaService service;

    @GetMapping("consulta/traer")
    @ResponseBody
    public List<Consulta> traerConsulta(){
        return service.getConsulta();
    }
    
    @PostMapping("consulta/crear")
    public String crearConsulta(@RequestBody Consulta consulta){
        service.saveConsulta(consulta);
        return "Consulta creada";
    }
    
    @DeleteMapping("consulta/borrar/{id}")
    public String borrarConsulta(@PathVariable int id){
       service.deleteConsulta(id);
       return "Consulta eliminada";
    }
    
    @PutMapping("consulta/editar")
    public Consulta editarConsulta(@RequestBody Consulta consulta)
    {
        Consulta c = service.findConsulta(consulta.getIdConsulta());
        
        if (c != null) {
            service.saveConsulta(consulta);
        }
                
        return c;
    }
}
