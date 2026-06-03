/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.novacam.form_novacam.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Esta clase representa a los usuarios registrados en NovaCam.
 * Aquí se almacena la información principal de cada modelo,
 * permitiendo gestionar sus datos dentro de la plataforma.
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    /**
     * Identificador único del usuario.
     * Se genera automáticamente cada vez que se registra un nuevo usuario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    /**
     * Nombre o seudónimo con el que la modelo se identifica en la plataforma.
     */
    @Column(name = "seudonimo")
    private String seudonimo;

    /**
     * Correo electrónico utilizado para el acceso y la comunicación.
     */
    @Column(name = "email")
    private String email;

    /**
     * Contraseña utilizada para ingresar al sistema.
     */
    @Column(name = "password")
    private String password;

    /**
     * Nivel de experiencia registrado por la modelo.
     */
    @Column(name = "experiencia")
    private String experiencia;

    /**
     * Equipo o herramienta principal utilizada para realizar transmisiones.
     */
    @Column(name = "equipo_usado")
    private String equipoUsado;

    /**
     * Fecha en la que se realizó el registro dentro de NovaCam.
     */
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    /**
     * Constructor vacío requerido por JPA para crear instancias de la entidad.
     */
    public Usuario() {
    }

    /**
     * Obtiene el identificador del usuario.
     * @return 
     */
    public Long getId() {
        return id;
    }

    /**
     * Asigna el identificador del usuario.
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el seudónimo registrado.
     * @return 
     */
    public String getSeudonimo() {
        return seudonimo;
    }

    /**
     * Actualiza el seudónimo del usuario.
     * @param seudonimo
     */
    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    /**
     * Obtiene el correo electrónico registrado.
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Actualiza el correo electrónico del usuario.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contraseña almacenada.
     * @return 
     */
    public String getPassword() {
        return password;
    }

    /**
     * Actualiza la contraseña del usuario.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene la experiencia registrada por la modelo.
     * @return 
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * Actualiza el nivel de experiencia.
     * @param experiencia
     */
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Obtiene el equipo utilizado por la modelo.
     * @return 
     */
    public String getEquipoUsado() {
        return equipoUsado;
    }

    /**
     * Actualiza la información del equipo utilizado.
     * @param equipoUsado
     */
    public void setEquipoUsado(String equipoUsado) {
        this.equipoUsado = equipoUsado;
    }

    /**
     * Obtiene la fecha de registro.
     * @return 
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Actualiza la fecha de registro.
     * @param fechaRegistro
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

