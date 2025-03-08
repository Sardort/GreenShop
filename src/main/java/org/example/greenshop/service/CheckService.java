package org.example.greenshop.service;

import org.example.greenshop.dto.CheckDto;
import org.example.greenshop.model.Check;
import org.example.greenshop.model.Result;
import org.example.greenshop.repository.CheckRepository;
import org.hibernate.engine.spi.Resolution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckService {
    @Autowired
    CheckRepository checkRepository;

    //getAll
    public List<Check>getAll(){
        return checkRepository.findAll();
    }

    //getById
    public Check getById(Integer id){
        return checkRepository.findById(id).get();
    }

    //create
    public Result create(CheckDto checkDto){
        Check check = new Check();
        check.setOrder_number(checkDto.getOrder_number());
        check.setDate(checkDto.getDate());
        check.setTotal(checkDto.getTotal());
        check.setPayment_method(checkDto.getPayment_method());
        check.setQuantity(checkDto.getQuantity());
        check.setSubtotal(checkDto.getSubtotal());
        check.setShiping(checkDto.getShiping());
        checkRepository.save(check);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, CheckDto checkDto){
        Optional<Check> checkOptional = checkRepository.findById(id);
        if (checkOptional.isPresent()){
            Check check = checkOptional.get();
            check.setOrder_number(checkDto.getOrder_number());
            check.setDate(checkDto.getDate());
            check.setTotal(checkDto.getTotal());
            check.setPayment_method(checkDto.getPayment_method());
            check.setQuantity(checkDto.getQuantity());
            check.setSubtotal(checkDto.getSubtotal());
            check.setShiping(checkDto.getShiping());
            checkRepository.save(check);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        checkRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
