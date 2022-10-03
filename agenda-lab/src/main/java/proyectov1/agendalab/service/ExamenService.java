package proyectov1.agendalab.service;

import java.util.List;

import proyectov1.agendalab.controller.dto.ExamenDto;

public interface ExamenService {

    void guardarExamen(ExamenDto examen);
    void editarExamen (ExamenDto examen);

    void borrarExamen(Long cups);

    List<ExamenDto> listarExamenes();

    // List<ExamenDto> getExamenBySeccionId(Integer seccionId);

    // ExamenDto getExamenById(String id);
    
}
