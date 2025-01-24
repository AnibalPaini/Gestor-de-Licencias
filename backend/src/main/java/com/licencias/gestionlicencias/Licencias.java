package com.licencias.gestionlicencias;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Licencias {
    private Long id;
    private String titulo;
    private LocalDate fechaAlta;
    private LocalDate fechaVencimiento; 

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    private boolean notificacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public boolean isNotificacion() {
        return notificacion;
    }
    public void setNotificacion(boolean notificacion) {
        this.notificacion = notificacion;
    }
    

    public Licencias() {
    }

    public Licencias(String titulo, LocalDate fechaAlta, LocalDate fechaVencimiento, Usuario usuario, boolean notificacion) {
        this.titulo = titulo;
        this.fechaAlta = fechaAlta;
        this.fechaVencimiento = fechaVencimiento;
        this.usuario = usuario;
        this.notificacion = notificacion;
    }


}
