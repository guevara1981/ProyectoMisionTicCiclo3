package proyectov1.agendalab.model.repository;

import java.util.List;
import java.util.Optional;

import proyectov1.agendalab.model.entity.Seccion;

public interface SeccionRepository {
    
    List<Seccion>findAll();

    Optional<Seccion>findById(Integer id);
    
}
