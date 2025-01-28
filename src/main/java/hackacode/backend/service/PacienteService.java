package hackacode.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hackacode.backend.model.Paciente;
import hackacode.backend.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repo;

    public List<Paciente> getPaciente() {
        return repo.findAll();
    }

    public void savePaciente(Paciente paciente) {
        repo.save(paciente);
    }

    public void deletePaciente(long id) {
        repo.deleteById(id);
    }

    public Paciente findPaciente(long id) {
        return repo.findById(id).orElse(null);
    }
}