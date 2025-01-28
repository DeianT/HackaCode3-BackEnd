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
import hackacode.backend.model.Turno;
import hackacode.backend.service.TurnoService;

@RestController
@CrossOrigin(origins = {""})
public class TurnoController {
    @Autowired
    private TurnoService service;

    @GetMapping("turno/traer")
    @ResponseBody
    public List<Turno> traerTurno(){
        return service.getTurno();
    }
    
    @PostMapping("turno/crear")
    public String crearTurno(@RequestBody Turno turno){
        service.saveTurno(turno);
        return "Turno creado";
    }
    
    @DeleteMapping("turno/borrar/{id}")
    public String borrarTurno(@PathVariable int id){
       service.deleteTurno(id);
       return "Turno eliminado";
    }
    
    @PutMapping("turno/editar")
    public Turno editarTurno(@RequestBody Turno turno)
    {
        Turno t = service.findTurno(turno.getIdTurno());
        
        if (t != null) {
            service.saveTurno(turno);
        }
                
        return t;
    }
}
