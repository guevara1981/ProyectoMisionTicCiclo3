package proyectov1.agendalab.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectov1.agendalab.model.entity.Seccion;

public interface SeccionRepository extends JpaRepository<Seccion, Integer> {

    Optional<Seccion> findByNombre(String string);
   
}
