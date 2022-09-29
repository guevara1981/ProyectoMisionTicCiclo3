package proyectov1.agendalab.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

import proyectov1.agendalab.controller.dto.ExamenDto;
import proyectov1.agendalab.controller.dto.SeccionDto;

@Controller
public class AgendaLabController {

    @GetMapping(value = {"/", "/index", "/index.html"})
    public String goToIndex(Model model){
        return "index";
    }

    private final List<SeccionDto> seccion = Arrays.asList(
            new SeccionDto("Inmunología",1),
            new SeccionDto("Microbiología",2),
            new SeccionDto("Hematología",3),
            new SeccionDto("Química",4));

    private final List<ExamenDto> examenes = Arrays.asList(
            new ExamenDto(901001, "Antibiograma (disco)", 15000.00,"El antibiograma es la prueba microbiológica que se realiza para determinar la susceptibilidad (sensibilidad o resistencia) de una bacteria a un grupo de antibiótico"),
            new ExamenDto(901107, "Gram de Orina", 65000.00,"Prueba que detecta bacterias en el lugar donde se sospecha una infección"));


    @GetMapping("/admin")
    public String goToAdmin(Model model){
        model.addAttribute("exam", "Parametrización de exámenes");
                  
        model.addAttribute("secciones", seccion);


        @GetMapping("/{teamId}")
    public String (@PathVariable("teamId") long teamId, Model model) {
        Team team = teamService.getTeam(teamId).orElseThrow( () -> ...);
        model.addAttribute("team", EditTeamFormData.fromTeam(team));
        model.addAttribute("users", userService.getAllUsersNameAndId()); 

        return "teams/edit";
    }
        
        return "admin";
    }

    @GetMapping("/contactenos")
    public String goToContactenos(Model model){
        return "contactenos";
    }

    @GetMapping("/login")
    public String goToLogin(Model model){
        return "login";
    }

    @GetMapping("/registro")
    public String goToRegistro(Model model){
        return "registro";
    }

    @GetMapping("/servicios")
    public String goToServicios(Model model){
        return "servicios";
    }

    @GetMapping("/usuario")
    public String goToUsuario(Model model){
        return "usuario";
    }
    
}
