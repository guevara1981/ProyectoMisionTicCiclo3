package proyectov1.agendalab.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import proyectov1.agendalab.controller.dto.ExamenDto;
import proyectov1.agendalab.controller.dto.SeccionDto;

@AllArgsConstructor
@Controller
public class AgendaLabController {

    @GetMapping(value = {"/", "/index", "/index.html"})
    public String goToIndex(Model model){
        return "index";
    }

    //private final List<SeccionDto> seccion = Arrays.asList(
            

    //private final List<ExamenDto> examenes = Arrays.asList(
            //new ExamenDto(901001, "Antibiograma (disco)", 15000.00,"El antibiograma es la prueba microbiológica que se realiza para determinar la susceptibilidad (sensibilidad o resistencia) de una bacteria a un grupo de antibiótico"),
            //new ExamenDto(901107, "Gram de Orina", 65000.00,"Prueba que detecta bacterias en el lugar donde se sospecha una infección"));


    @GetMapping("/admin")
    public String goToAdmin(Model model){
        var secciones = this.SeccionService.getSecciones();

        model.addAttribute("exam", "Parametrización de exámenes");
        

        // var secciones = Arrays.asList(
        //     new SeccionDto("Inmunología",1),
        //     new SeccionDto("Microbiología",2),
        //     new SeccionDto("Hematología",3),
        //     new SeccionDto("Química",4)
        // );
                
        model.addAttribute("secciones", secciones);
        
        
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
