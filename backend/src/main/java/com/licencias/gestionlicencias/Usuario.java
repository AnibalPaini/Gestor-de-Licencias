package com.licencias.gestionlicencias;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String userName;
    private String correo;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Licencias> licencia;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public List<Licencias> getLicencia() {
        return licencia;
    }
    public void setLicencia(List<Licencias> licencia) {
        this.licencia = licencia;
    }

    public Usuario(){
    }

    public Usuario(String nombre, String apellido, String userName, String correo, List<Licencias> licencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.correo = correo;
        this.licencia = licencia;
    }
    

}
