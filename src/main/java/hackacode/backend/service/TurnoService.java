package hackacode.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hackacode.backend.model.Turno;
import hackacode.backend.repository.TurnoRepository;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepository repo;

    public List<Turno> getTurno() {
        return repo.findAll();
    }

    public void saveTurno(Turno turno) {
        repo.save(turno);
    }

    public void deleteTurno(long id) {
        repo.deleteById(id);
    }

    public Turno findTurno(long id) {
        return repo.findById(id).orElse(null);
    }
}
