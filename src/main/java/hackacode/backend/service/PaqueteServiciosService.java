package hackacode.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hackacode.backend.model.PaqueteServicios;
import hackacode.backend.repository.PaqueteServiciosRepository;

@Service
public class PaqueteServiciosService {
    @Autowired
    private PaqueteServiciosRepository repo;

    public List<PaqueteServicios> getPaqueteServicios() {
        return repo.findAll();
    }

    public void savePaqueteServicios(PaqueteServicios paquete) {
        repo.save(paquete);
    }

    public void deletePaqueteServicios(long id) {
        repo.deleteById(id);
    }

    public PaqueteServicios findPaqueteServicios(long id) {
        return repo.findById(id).orElse(null);
    }
}
