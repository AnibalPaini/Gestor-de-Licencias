package com.licencias.gestionlicencias;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenciaRepository extends JpaRepository<Licencias, Long> {
    List<Licencias> findByFechaVencimientoAndNotificado(LocalDate fechaVencimiento, boolean notificado);
}
