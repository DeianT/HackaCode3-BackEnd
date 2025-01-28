package hackacode.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hackacode.backend.model.Consulta;
import hackacode.backend.repository.ConsultaRepository;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository repo;

    public List<Consulta> getConsulta() {
        return repo.findAll();
    }

    public void saveConsulta(Consulta consulta) {
        repo.save(consulta);
    }

    public void deleteConsulta(long id) {
        repo.deleteById(id);
    }

    public Consulta findConsulta(long id) {
        return repo.findById(id).orElse(null);
    }
}
