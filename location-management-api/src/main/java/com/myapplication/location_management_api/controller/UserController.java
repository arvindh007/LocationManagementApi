package com.myapplication.location_management_api.controller;

import com.myapplication.location_management_api.model.UserModel;
import com.myapplication.location_management_api.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;
    @PostMapping("/users")
    public void login(@RequestBody UserModel userModel){
        userService.login(userModel);

    }
}
