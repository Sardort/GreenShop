package org.example.greenshop.controller;

import org.example.greenshop.dto.Shopping_cartDto;
import org.example.greenshop.model.Result;
import org.example.greenshop.model.Shopping_cart;
import org.example.greenshop.service.Shopping_cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")
public class Shopping_cartController {
    @Autowired
    Shopping_cartService shopping_cartService;

    @GetMapping
    public List<Shopping_cart> getAll(){
        List<Shopping_cart> list = shopping_cartService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Shopping_cart getById(@PathVariable Integer id){
        Shopping_cart shopping_cart = shopping_cartService.getById(id);
        return shopping_cart;
    }

    @PostMapping
    public Result create(@RequestBody Shopping_cartDto shopping_cartDto){
        Result result = shopping_cartService.create(shopping_cartDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Shopping_cartDto shopping_cartDto){
        Result result = shopping_cartService.update(id, shopping_cartDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = shopping_cartService.delete(id);
        return result;
    }
}
