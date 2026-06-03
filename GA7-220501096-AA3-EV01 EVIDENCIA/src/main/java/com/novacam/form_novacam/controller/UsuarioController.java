/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.novacam.form_novacam.controller;

import com.novacam.form_novacam.model.Usuario;
import com.novacam.form_novacam.services.UsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador encargado de gestionar las solicitudes relacionadas
 * con los usuarios de NovaCam.
 *
 * Aquí se definen los endpoints que permiten consultar,
 * registrar y eliminar información de la base de datos.
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    /**
     * Inyección del servicio encargado de la lógica de negocio.
     */
    @Autowired
    private UsuarioService usuarioService;

    /**
     * Permite consultar todos los usuarios registrados en NovaCam.
     *
     * URL: GET http://localhost:8080/usuarios
     *
     * @return lista de usuarios almacenados en la base de datos.
     */
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    /**
     * Permite buscar un usuario utilizando su identificador.
     *
     * URL: GET http://localhost:8080/usuarios/{id}
     *
     * @param id identificador único del usuario.
     * @return usuario encontrado si existe.
     */
    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    /**
     * Permite registrar un nuevo usuario en la base de datos.
     *
     * URL: POST http://localhost:8080/usuarios
     *
     * @param usuario información enviada para registrar el usuario.
     * @return usuario guardado en la base de datos.
     */
    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    /**
     * Permite eliminar un usuario utilizando su identificador.
     *
     * URL: DELETE http://localhost:8080/usuarios/{id}
     *
     * @param id identificador del usuario que se desea eliminar.
     */
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }
}

