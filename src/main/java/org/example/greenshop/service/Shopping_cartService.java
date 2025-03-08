package org.example.greenshop.service;

import org.example.greenshop.dto.Shopping_cartDto;
import org.example.greenshop.model.Result;
import org.example.greenshop.model.Shopping_cart;
import org.example.greenshop.repository.Shopping_cartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Shopping_cartService {
    @Autowired
    Shopping_cartRepository shopping_cartRepository;

    //getAll
    public List<Shopping_cart> getAll(){
        return shopping_cartRepository.findAll();
    }

    //getById
    public Shopping_cart getById(Integer id){
        return shopping_cartRepository.findById(id).get();
    }

    //create
    public Result create(Shopping_cartDto shopping_cartDto){
        Shopping_cart shopping_cart = new Shopping_cart();
        shopping_cart.setPrice(shopping_cartDto.getPrice());
        shopping_cart.setQuantity(shopping_cartDto.getQuantity());
        shopping_cart.setTotal(shopping_cartDto.getTotal());
        shopping_cart.setSubtotal(shopping_cartDto.getSubtotal());
        shopping_cart.setShiping(shopping_cartDto.getShiping());
        shopping_cart.setTotal_cart(shopping_cartDto.getTotal_cart());
        shopping_cartRepository.save(shopping_cart);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, Shopping_cartDto shopping_cartDto){
        Optional<Shopping_cart> shopping_cartOptional = shopping_cartRepository.findById(id);
        if (shopping_cartOptional.isPresent()){
            Shopping_cart shopping_cart = shopping_cartOptional.get();
            shopping_cart.setPrice(shopping_cartDto.getPrice());
            shopping_cart.setQuantity(shopping_cartDto.getQuantity());
            shopping_cart.setTotal(shopping_cartDto.getTotal());
            shopping_cart.setSubtotal(shopping_cartDto.getSubtotal());
            shopping_cart.setShiping(shopping_cartDto.getShiping());
            shopping_cart.setTotal_cart(shopping_cartDto.getTotal_cart());
            shopping_cartRepository.save(shopping_cart);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        shopping_cartRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
