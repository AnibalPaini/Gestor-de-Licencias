package com.licencias.gestionlicencias;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/licencias")
public class LicenciaController {
    private final LicenciaService licenciaService;

    public LicenciaController(LicenciaService licenciaService) {
        this.licenciaService = licenciaService;
    }

    @GetMapping
    public List<Licencias> obtenerLicencias() {
        return licenciaService.obtenerLicencias();
    }

    @PostMapping
    public Licencias agregarLicencia(@RequestBody Licencias licencia) {
        return licenciaService.agregarLicencia(licencia);
    }

    @DeleteMapping("/{id}")
    public void eliminarLicencia(@PathVariable Long id) {
        licenciaService.eliminarLicencia(id);
    }
}
