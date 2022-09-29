package proyectov1.agendalab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaLabApplication.class, args);
	}


// private void cargarUsuarios(){
// 	usuariosRepository.save(new Usuarios(username:"admin", activo: true, admin: true, 
// 							apellidos:"Guevara", contrasena:"admin", 
// 							direccion: "Carrera 2B # 59D 51", 
// 							email:"andresguevara_1981@hotmail.com", 
// 							nombres:"Andres", tel_fijo:"6027777777", tel_movil:"3235720044"))
// }

}