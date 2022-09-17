package com.example.grafana.controller;

import com.example.grafana.model.UserEntity;
import com.example.grafana.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/findAll")
    @ResponseBody
    public ResponseEntity<List<UserEntity>> findAll() {
        return new ResponseEntity<>(this.userService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> save(@RequestBody UserEntity user) throws Exception {
        this.userService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<Void> delete(@RequestParam String username) throws Exception {
        this.userService.delete(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
