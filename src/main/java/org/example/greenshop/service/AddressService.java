package org.example.greenshop.service;

import org.example.greenshop.dto.AddressDto;
import org.example.greenshop.model.Address;
import org.example.greenshop.model.Result;
import org.example.greenshop.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    //getAll
    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    //getById
    public Address getById(Integer id){
        return addressRepository.findById(id).get();
    }

    //create
    public Result create(AddressDto addressDto){
        Address address = new Address();
        address.setCountry(addressDto.getCountry());
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setState(addressDto.getState());
        address.setZip(addressDto.getZip());
        address.setCreated_date(addressDto.getCreated_date());
        addressRepository.save(address);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, AddressDto addressDto){
        Optional<Address> addressOptional = addressRepository.findById(id);
        if (addressOptional.isPresent()){
            Address address = addressOptional.get();
            address.setCountry(addressDto.getCountry());
            address.setCity(addressDto.getCity());
            address.setStreet(addressDto.getStreet());
            address.setState(addressDto.getState());
            address.setZip(addressDto.getZip());
            address.setCreated_date(addressDto.getCreated_date());
            addressRepository.save(address);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        addressRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
