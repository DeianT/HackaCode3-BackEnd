package hackacode.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.Medico;
import hackacode.backend.repository.MedicoRepository;

@Repository
public class MedicoService {
    @Autowired
    private MedicoRepository repo;

    public List<Medico> getMedico() {
        return repo.findAll();
    }

    public void saveMedico(Medico medico) {
        repo.save(medico);
    }

    public void deleteMedico(long id) {
        repo.deleteById(id);
    }

    public Medico findMedico(long id) {
        return repo.findById(id).orElse(null);
    }
}
