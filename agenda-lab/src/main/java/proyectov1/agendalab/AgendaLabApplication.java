package proyectov1.agendalab;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import proyectov1.agendalab.model.entity.Seccion;
import proyectov1.agendalab.model.repository.ExamenRepository;
import proyectov1.agendalab.model.repository.SeccionRepository;

@SpringBootApplication
public class AgendaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaLabApplication.class, args);
	}

	@Data
	@AllArgsConstructor
	public static class DataLoader implements CommandLineRunner{

		private final SeccionRepository seccionRepository;
		private final ExamenRepository examenRepository;

		@Override
		public void run(String... args) throws Exception {
			//cargarSecciones();
			// cargarExamenes();
			// cargar Usuarios();
		}

		// private void cargarSecciones() {
		// 	var inmuno = seccionRepository.save(new Seccion("Inmunología"));
		// 	var micro = seccionRepository.save(new Seccion("Microbiología"));
		// 	var qui = seccionRepository.save(new Seccion("Química"));
		// 	var hema = seccionRepository.save(new Seccion("Hematología"));

		// 	var secciones = Arrays.asList(
		// 	new Seccion("Inmunología"),
		// 	new Seccion("Microbiología"),
		// 	new Seccion("Química"),
		// 	new Seccion("Hematología"));
		// }

	}

	

		// private void cargarUsuarios(){
		// 	usuariosRepository.save(new Usuarios(username:"admin", activo: true, admin: true, 
		// 							apellidos:"Guevara", contrasena:"admin", 
		// 							direccion: "Carrera 2B # 59D 51", 
		// 							email:"andresguevara_1981@hotmail.com", 
		// 							nombres:"Andres", tel_fijo:"6027777777", tel_movil:"3235720044"))
		// }

}