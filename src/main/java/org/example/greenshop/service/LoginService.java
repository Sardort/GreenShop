package org.example.greenshop.service;

import lombok.extern.java.Log;
import org.example.greenshop.dto.LoginDto;
import org.example.greenshop.model.Login;
import org.example.greenshop.model.Result;
import org.example.greenshop.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public List<Login> getAll(){
        return loginRepository.findAll();
    }

    public Login getById(Integer id){
        return loginRepository.findById(id).get();
    }

    public Result create(LoginDto loginDto){
        Login login = new Login();
        login.setEmail(loginDto.getEmail());
        login.setPassword(loginDto.getPassword());
        loginRepository.save(login);
        return new Result(true, "Saqlandi");
    }

    public Result update(Integer id, LoginDto loginDto){
        Optional<Login> loginOptional = loginRepository.findById(id);
        if (loginOptional.isPresent()){
            Login login = loginOptional.get();
            login.setEmail(loginDto.getEmail());
            login.setPassword(loginDto.getPassword());
            loginRepository.save(login);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    public Result delete(Integer id){
        loginRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }


}
