package io.glide.test_project_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.glide.test_project_api.model.Users;
import io.glide.test_project_api.service.UserService;

@RestController
@RequestMapping ("/users")
public class UserController {

    @Autowired
    private final UserService userService;

  public   UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody Users user) {
        return          userService.registerUser(user);

    }
    @GetMapping("/{userId}")
    public Users getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId).orElse(null);
    }
    
   
}