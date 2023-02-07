package com.example.keycloak;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
UserRepository repository;

@RolesAllowed("admin")
@PostMapping("/post")
public User insertdata(@RequestBody User user) {
	return repository.save(user);
}
@RolesAllowed("user")
@GetMapping("/get")
public List<User>getdata(){
	return repository.findAll();
}
}
