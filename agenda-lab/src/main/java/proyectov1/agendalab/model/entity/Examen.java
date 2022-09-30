package proyectov1.agendalab.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "examen")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Examen {
    @Id
    private Long cups;

    private String examen;
    private String descripcion;
    private Double valor;


    @ManyToOne
    private Seccion seccion;
    }
