package proyectov1.agendalab.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.valves.rewrite.InternalRewriteMap.Escape;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import proyectov1.agendalab.controller.dto.ExamenDto;
import proyectov1.agendalab.controller.dto.SeccionDto;
import proyectov1.agendalab.model.entity.Examen;
import proyectov1.agendalab.model.entity.Seccion;
import proyectov1.agendalab.model.repository.ExamenRepository;
import proyectov1.agendalab.model.repository.SeccionRepository;
import proyectov1.agendalab.service.SeccionService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SeccionServiceImpl implements SeccionService {

    private final SeccionRepository seccionRepository;
    private final ExamenRepository examenRepository;

    @Override
    public List<SeccionDto> getSecciones() {
        var secciones = seccionRepository.findAll(Sort.by("nombre"));
        
        return secciones.stream()
                .map(sec -> new SeccionDto(sec.getNombre(), sec.getId()))
                .collect(Collectors.toList());
    }
   
    @Override
    public Optional<SeccionDto> getSeccionById(Integer id) {
        var seccion = seccionRepository.findById(id);

        if (seccion.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(new SeccionDto(
                seccion.get().getNombre(),
                seccion.get().getId()));
    }

    @Override
    public void guardarExamen(ExamenDto exam) {
        var entity = new Examen();
        entity.setCups(exam.getCups());
        entity.setCreacion(new Date());
        entity.setExamen(exam.getExamen());
        entity.setDescripcion(exam.getDescripcion());
        entity.setValor(exam.getValor());

        var seccionOp = seccionRepository.findById(exam.getSeccion());
        entity.setSeccion(seccionOp.get());

        examenRepository.save(entity);
        
    }

    @Override
    public void borrarExamen(ExamenDto examen) {
        // TODO Auto-generated method stub
        
    }

    // @Override
    // public void borrarExamen(Long cups) {
    //     var examenOp = examenRepository.findById(cups);
    //     if (examenOp.isEmpty()) {
    //         throw new RuntimeException("El examen no existe");
    //     }

    //     examenRepository.delete(userOp.get());
    // }


    // @Override
    // public List<ExamenDto> getExamenBySeccionId(Integer seccionId) {
    //     var examen = examenRepository.findAllBySeccion(seccionId.longValue());

    //     var seccionExamen = examen.stream()
    //             .map(mov -> ExamenDto.builder()
    //                     .id(exa.getCups())
    //                     .examen(exa.getExamen())
    //                     .descripcion(exa.getDescripcion())
    //                     .valor(exa.getValor())
    //                     .build())
    //             .collect(Collectors.toList());

    //     return seccionExamen;
    // }



}

