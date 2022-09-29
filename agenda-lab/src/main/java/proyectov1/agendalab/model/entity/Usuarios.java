package proyectov1.agendalab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuarios {
    @Id
    private String username;
    private String contrasena;
    private String nombres;
    private String apellidos;

    @Column(unique=true)
    private String email;

    private String direccion;

    private String tel_fijo;

    private String tel_movil;

    private Boolean activo;
    
    private Boolean admin;
    
}
