/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.novacam.form_novacam.services;

import com.novacam.form_novacam.model.Usuario;
import com.novacam.form_novacam.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Esta clase contiene la lógica de negocio relacionada con los usuarios
 * de NovaCam. Su función es gestionar las operaciones de consulta,
 * registro y eliminación de información antes de interactuar con la base de datos.
 */
@Service
public class UsuarioService {

    /**
     * Inyección del repositorio que permite acceder a la información
     * almacenada en la base de datos.
     */
    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     * Obtiene la lista completa de usuarios registrados en NovaCam.
     *
     * @return lista de usuarios almacenados en la base de datos.
     */
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    /**
     * Guarda un nuevo usuario o actualiza uno existente.
     *
     * @param usuario información del usuario a registrar.
     * @return usuario almacenado en la base de datos.
     */
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    /**
     * Busca un usuario utilizando su identificador único.
     *
     * @param id identificador del usuario.
     * @return usuario encontrado si existe.
     */
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    /**
     * Permite localizar un usuario mediante su correo electrónico.
     *
     * @param email correo registrado por el usuario.
     * @return usuario encontrado si existe.
     */
    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    /**
     * Permite buscar un usuario utilizando su seudónimo dentro de la plataforma.
     *
     * @param seudonimo nombre o alias de la modelo.
     * @return usuario encontrado si existe.
     */
    public Optional<Usuario> buscarPorSeudonimo(String seudonimo) {
        return usuarioRepository.findBySeudonimo(seudonimo);
    }

    /**
     * Elimina un usuario de la base de datos utilizando su identificador.
     *
     * @param id identificador del usuario que se desea eliminar.
     */
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

