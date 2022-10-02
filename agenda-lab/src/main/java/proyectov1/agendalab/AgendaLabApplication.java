package proyectov1.agendalab;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import proyectov1.agendalab.model.entity.Seccion;
import proyectov1.agendalab.model.entity.Usuario;
import proyectov1.agendalab.model.repository.ExamenRepository;
import proyectov1.agendalab.model.repository.SeccionRepository;
import proyectov1.agendalab.model.repository.UsuarioRepository;

@SpringBootApplication
public class AgendaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaLabApplication.class, args);
	}

	@Component
	@Data
	@AllArgsConstructor
	public static class DataLoader implements CommandLineRunner {

		private final SeccionRepository seccionRepository;
		private final ExamenRepository examenRepository;
		private final UsuarioRepository usuarioRepository;

		@Override
		public void run(String... args) throws Exception {
			cargarSecciones();
			//cargarExamenes();
			cargarUsuarios();
		}

		// private void cargarSecciones() {
		// var inmuno = seccionRepository.save(new Seccion("Inmunología"));
		// var micro = seccionRepository.save(new Seccion("Microbiología"));
		// var qui = seccionRepository.save(new Seccion("Química"));
		// var hema = seccionRepository.save(new Seccion("Hematología"));

		// var secciones = Arrays.asList(
		// new Seccion("Inmunología"),
		// new Seccion("Microbiología"),
		// new Seccion("Química"),
		// new Seccion("Hematología"));
		// }

		private void cargarUsuarios() {
			usuarioRepository.saveAll(Arrays.asList(
					new Usuario("admin", (long) 1085963452, "12345", "Andres", "Guevara",
							"andresguevara_1981@hotmail.com", "Carrera 2B # 59D 51", "3206984563", true, true),
					new Usuario("admin2", (long) 1085310569, "123456", "Cristhian", "Medina",
							"cristhian.medina.o@gmail.com", "Manzana 15 casa 9", "3206764849", true, true)));
		}

		private void cargarSecciones() {
			seccionRepository.saveAll(Arrays.asList(
					new Seccion("Inmunología"),
					new Seccion("Microbiología"),
					new Seccion("Química"),
					new Seccion("Hematología")));
		}

	}

	// private final List<SeccionDto> seccion = Arrays.asList(

	// private final List<ExamenDto> examenes = Arrays.asList(
	// new ExamenDto(901001, "Antibiograma (disco)", 15000.00,"El antibiograma es la
	// prueba microbiológica que se realiza para determinar la susceptibilidad
	// (sensibilidad o resistencia) de una bacteria a un grupo de antibiótico"),
	// new ExamenDto(901107, "Gram de Orina", 65000.00,"Prueba que detecta bacterias
	// en el lugar donde se sospecha una infección"));

	// private void cargarUsuarios(){
	// usuariosRepository.save(new Usuarios(username:"admin", activo: true, admin:
	// true,
	// apellidos:"Guevara", contrasena:"admin",
	// direccion: "Carrera 2B # 59D 51",
	// email:"andresguevara_1981@hotmail.com",
	// nombres:"Andres", tel_fijo:"6027777777", tel_movil:"3235720044"))
	// }

}