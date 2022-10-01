package proyectov1.agendalab.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @Column(nullable = false)
    private Long cups;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creacion;

    @Column(nullable = false)
    private String examen;

    private String descripcion;

    @Column(nullable = false)
    private Double valor;


    @ManyToOne
    private Seccion seccion;
    }
