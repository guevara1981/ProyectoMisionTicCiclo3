package proyectov1.agendalab.model.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectov1.agendalab.model.entity.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
        
    //List<Examen> findAllBySeccion(Long seccionId);

    //List<Examen> findAllByCategoryId(List<Long> seccionId);
   
}
