package hackacode.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackacode.backend.model.PaqueteServicios;

@Repository
public interface PaqueteServiciosRepository  extends JpaRepository<PaqueteServicios, Long>{
    
}