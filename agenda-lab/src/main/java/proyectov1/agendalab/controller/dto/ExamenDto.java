package proyectov1.agendalab.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamenDto {
    
    private Integer cups;
    private String examen;
    private Double valor;
    private String descripcion;
}
