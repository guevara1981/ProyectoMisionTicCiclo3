package proyectov1.agendalab.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectov1.agendalab.model.entity.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, String>{

    Optional<Usuarios> findByUsernameAndContrasenaAndActivoIsTrue(String username, String contrasena);

    Optional<Usuarios> findByEmail(String email);
}
    

