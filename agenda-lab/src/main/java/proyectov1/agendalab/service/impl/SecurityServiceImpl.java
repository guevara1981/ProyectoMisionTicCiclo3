package proyectov1.agendalab.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import proyectov1.agendalab.controller.dto.UsuariosRespuesta;
import proyectov1.agendalab.controller.dto.UsuariosSolicitud;
import proyectov1.agendalab.model.repository.UsuarioRepository;
import proyectov1.agendalab.service.SecurityService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final UsuarioRepository usuariosRepository;

    @Override
    public UsuariosRespuesta validarUsuario(String username, String contrasena) {
        var userOp = usuariosRepository.findById(username);
        if(userOp.isEmpty()){
            throw new RuntimeException("Usuario no existente");
        }

        var user = userOp.get();
        if(!user.getActivo()){
            throw new RuntimeException("Usuario inactivo");
        }
        
        if(!user.getContrasena().equals(contrasena)){
           throw new RuntimeException("Credenciales inválidas");
        } 

        return UsuariosRespuesta.builder()
                .username(user.getUsername())
                .nombres(user.getNombres())
                .apellidos(user.getApellidos())
                .email(user.getEmail())
                .direccion(user.getDireccion())
                .tel_fijo(user.getTel_fijo())
                .tel_movil(user.getTel_movil())
                .admin(user.getAdmin())
                .build();

    }

    @Override
    public List<UsuariosRespuesta> getAllUsers() {
        return usuariosRepository.findAll().stream()
                .map(u -> UsuariosRespuesta.builder()
                .username(u.getUsername())
                .nombres(u.getNombres())
                .apellidos(u.getApellidos())
                .email(u.getEmail())
                .direccion(u.getDireccion())
                .tel_fijo(u.getTel_fijo())
                .tel_movil(u.getTel_movil())
                .admin(u.getAdmin())
                .build())
            .collect(Collectors.toList());
       
    }

    @Override
    public UsuariosRespuesta getUserByUsername(String username) {
        var userOp = usuariosRepository.findById(username);
        if(userOp.isEmpty()){
            throw new RuntimeException("El usuario no existe");
        }
        
        var user = userOp.get();
        return UsuariosRespuesta.builder()
                .username(user.getUsername())
                .nombres(user.getNombres())
                .apellidos(user.getApellidos())
                .email(user.getEmail())
                .direccion(user.getDireccion())
                .tel_fijo(user.getTel_fijo())
                .tel_movil(user.getTel_movil())
                .admin(user.getAdmin())
                .build();
    }

    @Override
    public void crearUsuarios(UsuariosSolicitud user) {
        
     
    }

    @Override
    public void actualizarUsuarios(UsuariosSolicitud user) {
        
        
    }

    @Override
    public void borrarUsuarios(String username) {
       
        
    }

    @Override
    public void activarUsuarios(String username) {
        
        
    }

    @Override
    public void inactivarUsuarios(String username) {
        
        
    }


}
