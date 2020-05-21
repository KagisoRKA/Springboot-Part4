package com.springboot.part4.controller;

import com.springboot.part4.DAO.FakeRepoInterface;
import com.springboot.part4.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    FakeRepoInterface repoInterface;
    @PostMapping("/add")
    public User newUser(@RequestBody User user){
        return repoInterface.insertUser(user.getId(),user.getName(),user.getSurname());
    }
    @GetMapping("/retrieve/{id}")
    public ResponseEntity<User> getUser(@PathVariable(value = "id")long userId){
        return new ResponseEntity(repoInterface.findUserById(userId), HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable(value = "id")long userId){
        repoInterface.deleteUser(userId);
        return new ResponseEntity("Success!", HttpStatus.OK);
    }
}