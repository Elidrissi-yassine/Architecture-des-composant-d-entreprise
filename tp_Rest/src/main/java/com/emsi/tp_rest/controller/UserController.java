package com.emsi.tp_rest.controller;

import com.emsi.tp_rest.model.User;
import com.emsi.tp_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        User user=userService.getUser(id);
        if(user!=null){
            return user;
        }
        return null;
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @DeleteMapping("/supp")
    public void SupprimerUser(@RequestParam Integer id){
        userService.suppUser(id);
    }
}
