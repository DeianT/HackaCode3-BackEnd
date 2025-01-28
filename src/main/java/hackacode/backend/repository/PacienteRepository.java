package hackacode.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

    
}