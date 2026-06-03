/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.novacam.form_novacam.repository;

import com.novacam.form_novacam.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Este repositorio permite la comunicación entre la aplicación NovaCam
 * y la base de datos. Gracias a JpaRepository se pueden realizar
 * operaciones CRUD sin necesidad de escribir consultas SQL básicas.
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /**
     * Permite buscar un usuario utilizando su correo electrónico.
     * Es útil para validar registros o procesos de inicio de sesión.
     * @param email
     * @return 
     */
    Optional<Usuario> findByEmail(String email);

    /**
     * Permite buscar un usuario mediante su seudónimo dentro de la plataforma.
     * @param seudonimo
     * @return 
     */
    Optional<Usuario> findBySeudonimo(String seudonimo);

}

