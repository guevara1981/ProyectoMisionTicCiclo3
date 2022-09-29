package proyectov1.agendalab.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuariosRespuesta {
    private String username;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private String tel_fijo;
    private String tel_movil;
    private Boolean admin;
    
}
