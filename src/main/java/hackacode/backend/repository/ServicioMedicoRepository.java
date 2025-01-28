package hackacode.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.ServicioMedico;

@Repository
public interface ServicioMedicoRepository extends JpaRepository<ServicioMedico, Long> {
    
}
