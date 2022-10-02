package proyectov1.agendalab.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyectov1.agendalab.model.entity.Seccion;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExamenDto {
    private Long cups;
    private String examen;
    private Double valor;
    private String descripcion;
    private Integer seccion;
}
