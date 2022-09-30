package proyectov1.agendalab.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "examen")
@Data
public class Examen {
    @Id
    private Long cups;

    private String examen;
    private Double valor;
    private String descripcion;

    @ManyToOne
    private Seccion seccion;
    }
