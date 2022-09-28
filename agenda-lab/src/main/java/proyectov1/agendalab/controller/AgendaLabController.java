package proyectov1.agendalab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

@Controller
public class AgendaLabController {

    @GetMapping(value = {"/", "/index", "/index.html"})
    public String goToIndex(Model model){
        return "index";
    }


    @GetMapping("/admin")
    public String goToAdmin(Model model){
        model.addAttribute("exam", "Parametrización de exámenes");
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
        return "contactenos";
    }

    @GetMapping("/usuario")
    public String goToUsuario(Model model){
        return "usuario";
    }
    
}
