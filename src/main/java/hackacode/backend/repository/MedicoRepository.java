package hackacode.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
}
