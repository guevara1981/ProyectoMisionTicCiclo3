package proyectov1.agendalab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendaLabController {
    @GetMapping("/admin")
    public String goToAdmin(Model model){
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
