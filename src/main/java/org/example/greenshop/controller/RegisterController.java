package org.example.greenshop.controller;

import org.example.greenshop.dto.RegisterDto;
import org.example.greenshop.model.Register;
import org.example.greenshop.model.Result;
import org.example.greenshop.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @GetMapping
    public List<Register> getAll(){
        List<Register> list = registerService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Register getById(@PathVariable Integer id){
        Register register = registerService.getById(id);
        return register;
    }

    @PostMapping
    public Result create(@RequestBody RegisterDto registerDto){
        Result result = registerService.create(registerDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody RegisterDto registerDto){
        Result result = registerService.update(id, registerDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = registerService.delete(id);
        return result;
    }
}
