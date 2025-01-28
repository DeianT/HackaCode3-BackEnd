package hackacode.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
    
}
