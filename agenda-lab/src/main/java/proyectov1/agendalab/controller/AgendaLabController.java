package proyectov1.agendalab.controller;

import java.util.Arrays;

//import java.util.Arrays;
//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
//import proyectov1.agendalab.controller.dto.ExamenDto;
import proyectov1.agendalab.controller.dto.SeccionDto;
import proyectov1.agendalab.service.SeccionService;

@AllArgsConstructor
@Controller
public class AgendaLabController {

    private SeccionService seccionService;

    @GetMapping(value = {"/", "/index", "/index.html"})
    public String goToIndex(Model model){
        return "index";
    }

    @GetMapping("/admin")
    public String goToAdmin(Model model){
        model.addAttribute("exam", "Parametrización de exámenes");
        
        var secciones = this.seccionService.getSecciones();
                     
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
