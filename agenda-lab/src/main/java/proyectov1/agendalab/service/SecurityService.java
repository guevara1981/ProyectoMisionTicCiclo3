package proyectov1.agendalab.service;

import java.util.List;

import proyectov1.agendalab.controller.dto.UsuariosRespuesta;
import proyectov1.agendalab.controller.dto.UsuariosSolicitud;

public interface SecurityService {

    UsuariosRespuesta validarUsuario(String username, String contrasena);

    List<UsuariosRespuesta> getAllUsers();

    UsuariosRespuesta getUserByUsername(String username);

    void crearUsuarios(UsuariosSolicitud user);

    void actualizarUsuarios(UsuariosSolicitud user);

    void borrarUsuarios(String username);

    void activarUsuarios(String username);

    void inactivarUsuarios(String username);
    }
