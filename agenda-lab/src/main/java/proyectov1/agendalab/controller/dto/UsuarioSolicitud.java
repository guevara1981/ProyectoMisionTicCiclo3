package proyectov1.agendalab.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioSolicitud {
    private String username;

    private String contrasena;

    private String nombres;

    private String apellidos;

    private String email;

    private String direccion;

    private Long tel_fijo;

    private Long tel_movil;
    
    private Boolean admin;
    
}
