package org.example.greenshop.controller;

import org.example.greenshop.dto.CategoryDto;
import org.example.greenshop.model.Category;
import org.example.greenshop.model.Result;
import org.example.greenshop.repository.CategoryRepository;
import org.example.greenshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Integer id){
        return categoryService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody CategoryDto categoryDto){
        Result result = categoryService.create(categoryDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CategoryDto categoryDto){
        Result result = categoryService.update(id, categoryDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = categoryService.delete(id);
        return result;
    }
}
