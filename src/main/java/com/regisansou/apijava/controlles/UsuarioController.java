package com.regisansou.apijava.controlles;

import com.regisansou.apijava.models.Usuario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.regisansou.apijava.repositories.UserRepository;



@RestController
public class UsuarioController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id")Integer id){
        repository.deleteById(id);
    }

}

    



