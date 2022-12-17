package com.example.multipleenvironmentusecasespringbootapplication.controller;


import com.example.multipleenvironmentusecasespringbootapplication.entity.User;
import com.example.multipleenvironmentusecasespringbootapplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/insert")
    public void  insertUser(@RequestBody User user){

        userRepo.save(user);
    }
    @GetMapping("/get")
    public List<User>  getAllUsers(){

        return  userRepo.findAll();
    }
}
