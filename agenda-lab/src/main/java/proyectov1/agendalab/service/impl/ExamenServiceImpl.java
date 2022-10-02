package proyectov1.agendalab.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import proyectov1.agendalab.controller.dto.ExamenDto;
import proyectov1.agendalab.model.entity.Examen;
import proyectov1.agendalab.model.repository.ExamenRepository;
import proyectov1.agendalab.model.repository.SeccionRepository;
import proyectov1.agendalab.service.ExamenService;

@AllArgsConstructor
@Service
public class ExamenServiceImpl implements ExamenService{

    private final SeccionRepository seccionRepository;
    private final  ExamenRepository examenRepository;

    @Override
    public void guardarExamen(ExamenDto examen) {
        var entity = new Examen();
        entity.setCups(examen.getCups());
        entity.setExamen(examen.getExamen());
        entity.setDescripcion(examen.getDescripcion());
        entity.setValor(examen.getValor());

        var seccionOp = seccionRepository.findById(examen.getSeccion());
        entity.setSeccion(seccionOp.get());

        examenRepository.save(entity);
        
    }

    @Override
    public void borrarExamen(ExamenDto examen) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<ExamenDto> listarExamenes() {
        var examenes = examenRepository.findAll();

        return examenes.stream()
                .map(exa -> new ExamenDto(exa.getCups(), exa.getExamen(), exa.getValor(), exa.getDescripcion(), exa.getSeccion().getId()))
                .collect(Collectors.toList());
    }

    
}
