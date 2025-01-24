package com.licencias.gestionlicencias;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LicenciaService {
    private final LicenciaRepository licenciaRepository;

    public LicenciaService(LicenciaRepository licenciaRepository) {
        this.licenciaRepository = licenciaRepository;
    }

    public List<Licencias> obtenerLicencias() {
        return licenciaRepository.findAll();
    }

    public Licencias agregarLicencia(Licencias licencia) {
        return licenciaRepository.save(licencia);
    }

    public void eliminarLicencia(Long id) {
        licenciaRepository.deleteById(id);
    }

    public List<Licencias> obtenerLicenciasPorNotificar() {
        LocalDate fechaNotificacion = LocalDate.now().plusDays(90);
        return licenciaRepository.findByFechaVencimientoAndNotificado(fechaNotificacion, false);
    }
}
