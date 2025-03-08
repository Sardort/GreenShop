package org.example.greenshop.controller;

import org.apache.catalina.LifecycleState;
import org.example.greenshop.dto.AddressDto;
import org.example.greenshop.model.Address;
import org.example.greenshop.model.Result;
import org.example.greenshop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping
    public List<Address> getAll(){
        List<Address> list = addressService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Address getById(@PathVariable Integer id){
        Address address = addressService.getById(id);
        return address;
    }

    @PostMapping
    public Result create(@RequestBody AddressDto addressDto){
        Result result = addressService.create(addressDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody AddressDto addressDto){
        Result result = addressService.update(id, addressDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result deelete(@PathVariable Integer id){
        Result result = addressService.delete(id);
        return result;
    }
}
