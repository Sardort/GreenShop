package org.example.greenshop.service;

import org.example.greenshop.dto.RegisterDto;
import org.example.greenshop.model.Register;
import org.example.greenshop.model.Result;
import org.example.greenshop.model.entity.Status;
import org.example.greenshop.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService {
    @Autowired
    RegisterRepository registerRepository;

    //getAll
    public List<Register> getAll(){
        return registerRepository.findAll();
    }

    //getById
    public Register getById(Integer id){
        return registerRepository.findById(id).get();
    }

    //create
    public Result create(RegisterDto registerDto){
        Register register = new Register();
        register.setUsername(registerDto.getUsername());
        register.setEmail(registerDto.getEmail());
        register.setPassword(registerDto.getPassword());
        register.setRepassword(registerDto.getRepassword());
        register.setRole(registerDto.getRole());
        register.setStatus(Status.ACTIVE);
        registerRepository.save(register);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, RegisterDto registerDto){
        Optional<Register> registerOptional = registerRepository.findById(id);
        if (registerOptional.isPresent()){
            Register register = registerOptional.get();
            register.setUsername(registerDto.getUsername());
            register.setEmail(registerDto.getEmail());
            register.setPassword(registerDto.getPassword());
            register.setRepassword(registerDto.getRepassword());
            register.setRole(registerDto.getRole());
            register.setStatus(Status.ACTIVE);
            registerRepository.save(register);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        registerRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
