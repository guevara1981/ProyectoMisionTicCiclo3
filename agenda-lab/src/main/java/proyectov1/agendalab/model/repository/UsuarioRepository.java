package proyectov1.agendalab.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectov1.agendalab.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

    Optional<Usuario> findByUsernameAndContrasenaAndActivoIsTrue(String username, String contrasena);

    Optional<Usuario> findByEmail(String email);

}
    

