package hackacode.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hackacode.backend.model.ServicioMedico;
import hackacode.backend.repository.ServicioMedicoRepository;

@Service
public class ServicioMedicoService {
    @Autowired
    private ServicioMedicoRepository repo;

    public List<ServicioMedico> getServicioMedico() {
        return repo.findAll();
    }

    public void saveServicioMedico(ServicioMedico servicio) {
        repo.save(servicio);
    }

    public void deleteServicioMedico(long id) {
        repo.deleteById(id);
    }

    public ServicioMedico findServicioMedico(long id) {
        return repo.findById(id).orElse(null);
    }
}
