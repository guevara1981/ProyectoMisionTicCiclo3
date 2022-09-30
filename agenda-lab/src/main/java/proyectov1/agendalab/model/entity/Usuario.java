package proyectov1.agendalab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
    @Id
    private String username;
    private Long identificacion;
    private String contrasena;
    private String nombres;
    private String apellidos;

    @Column(unique=true)
    private String email;

    private String direccion;

    private Long tel_fijo;

    private Long tel_movil;

    private Boolean activo;
    
    private Boolean admin;
    
}
