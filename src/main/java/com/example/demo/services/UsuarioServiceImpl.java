package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IUsuarioDAO;
import com.example.demo.entities.Usuario;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	public Optional<Usuario> findUserById(Long id) {
		return usuarioDao.findById(id);
	}

	@Override
	public Usuario saveUser(Usuario user) {
		return usuarioDao.save(user);
	}

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}
	
}
