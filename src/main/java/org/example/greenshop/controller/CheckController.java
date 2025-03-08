package org.example.greenshop.controller;

import org.example.greenshop.dto.CheckDto;
import org.example.greenshop.model.Check;
import org.example.greenshop.model.Result;
import org.example.greenshop.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/check")
public class CheckController {
    @Autowired
    CheckService checkService;

    @GetMapping
    public List<Check> getAll(){
        return checkService.getAll();
    }

    @GetMapping("/{id}")
    public Check getById(@PathVariable Integer id){
        return checkService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody CheckDto checkDto){
        return checkService.create(checkDto);
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CheckDto checkDto){
        return checkService.update(id, checkDto);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return checkService.delete(id);
    }
}
