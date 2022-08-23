package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Usuario;
import com.example.demo.services.IUsuarioService;

@RequestMapping("/API")
@RestController
public class ControladorREST{
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/login/{id}/{pass}")
	private Usuario validateLogin(@PathVariable Long id, 
								  @PathVariable String pass){
		if(usuarioService.findUserById(id).isEmpty()) {
			return null;
		}
		Usuario opt = usuarioService.findUserById(id).get();
		return (opt.getClave().equals(pass))? opt: null;
	}
	
	@PostMapping("/signup")
	private Usuario signUp(@RequestBody Usuario user) {
		if(usuarioService.findUserById(user.getDocumento()).isEmpty()) {
			return usuarioService.saveUser(user);
		}
		return null;
	}
	
}
