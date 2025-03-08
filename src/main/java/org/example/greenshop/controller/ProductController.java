package org.example.greenshop.controller;

import org.example.greenshop.dto.ProductDto;
import org.example.greenshop.model.Product;
import org.example.greenshop.model.Result;
import org.example.greenshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody ProductDto productDto){
        Result result = productService.create(productDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ProductDto productDto){
        Result result = productService.update(id, productDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = productService.delete(id);
        return result;
    }
}
