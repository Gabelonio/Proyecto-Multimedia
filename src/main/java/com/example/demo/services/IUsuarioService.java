package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Usuario;

public interface IUsuarioService {
	public Optional<Usuario> findUserById(Long id);
	
	public List<Usuario> findAll();
	
	public Usuario saveUser(Usuario user);
}
