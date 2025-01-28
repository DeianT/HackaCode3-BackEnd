package hackacode.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

    
}