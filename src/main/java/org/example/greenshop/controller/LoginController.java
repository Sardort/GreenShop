package org.example.greenshop.controller;

import org.example.greenshop.dto.LoginDto;
import org.example.greenshop.model.Login;
import org.example.greenshop.model.Result;
import org.example.greenshop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping
    public List<Login> getAll(){
        List<Login> list = loginService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Login getById(@PathVariable Integer id){
        Login login = loginService.getById(id);
        return login;
    }

    @PostMapping
    public Result create(@RequestBody LoginDto loginDto){
        Result result = loginService.create(loginDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody LoginDto loginDto){
        Result result = loginService.update(id, loginDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = loginService.delete(id);
        return result;
    }
}
