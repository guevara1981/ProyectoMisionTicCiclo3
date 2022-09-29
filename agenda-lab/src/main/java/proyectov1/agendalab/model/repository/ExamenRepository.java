package proyectov1.agendalab.model.repository;

import java.util.List;

import proyectov1.agendalab.model.entity.Examen;

public interface ExamenRepository {
    
    List<Examen> findAllByCategory(Long categoryId);
}
