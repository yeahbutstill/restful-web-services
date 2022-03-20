package com.yeahbutstill.restfulwebservices.controller;

import com.yeahbutstill.restfulwebservices.beans.User;
import com.yeahbutstill.restfulwebservices.exceptions.UserNotFoundException;
import com.yeahbutstill.restfulwebservices.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService service;

    // GET /users
    // retrieveAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/{id}
    // retrieveUser(Integer id)
    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable Integer id) {
        User user = service.findOne(id);

        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }

        EntityModel<User> model = EntityModel.of(user);
        WebMvcLinkBuilder linkToUsers = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
        model.add(linkToUsers.withRel("all-users"));
        return model;
    }

    // CREATED
    // input - details of user
    // output - CREATED & Return the created URI
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        User saveUser = service.save(user);
        // CREATED
        // /users/{id}   savedUser.getId
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        User user = service.deleteById(id);

        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }
    }

}
