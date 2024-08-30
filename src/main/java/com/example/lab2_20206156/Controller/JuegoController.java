package com.example.lab2_20206156.Controller;
import com.example.lab2_20206156.Model.ConfiguracionJuego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class JuegoController {

    @GetMapping("/configuracion")
    public String mostrarFormularioConfiguracion() {
        return "configuracion";
    }

    @PostMapping("/guardarConfiguracion")
    public String guardarConfiguracion(
            @RequestParam("tamanhoTarjeta") int tamanhoTarjeta,
            @RequestParam("numeroTarjeta") int numeroTarjeta,
            Model model) {

        ConfiguracionJuego configuracion = new ConfiguracionJuego(tamanhoTarjeta, numeroTarjeta);
        model.addAttribute("configuracion", configuracion);
        return "juego";
    }
}