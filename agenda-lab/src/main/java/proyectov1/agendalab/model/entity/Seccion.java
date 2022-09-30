package proyectov1.agendalab.model.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "seccion")
@Data
public class Seccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;    

    @OneToMany(mappedBy = "seccion")
    private List<Examen> examenes;
    
    public Seccion(String nombre) {
        this.nombre = nombre;
    }

}
