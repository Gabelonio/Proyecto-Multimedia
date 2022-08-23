package com.example.demo.services;

import java.util.Optional;

import com.example.demo.entities.Usuario;

public interface IUsuarioService {
	public Optional<Usuario> findUserById(Long id);
	
	public Usuario saveUser(Usuario user);
}
