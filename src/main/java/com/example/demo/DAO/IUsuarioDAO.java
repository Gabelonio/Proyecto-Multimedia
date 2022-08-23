package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Usuario;

@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

}
