package com.example.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    @Column(nullable = false, length = 50)
    private String tipo_documentos;

    @Column(nullable = false, length = 50)
    private String numero_documento;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(length = 50)
    private String telefono;

    @Column(length = 255)
    private String direccion;

    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    // Getters and setters

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getTipo_documentos() {
        return tipo_documentos;
    }

    public void setTipo_documentos(String tipo_documentos) {
        this.tipo_documentos = tipo_documentos;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}