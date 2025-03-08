package org.example.greenshop.controller;

import org.example.greenshop.dto.CardDto;
import org.example.greenshop.model.Card;
import org.example.greenshop.model.Result;
import org.example.greenshop.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping
    public List<Card> getAll(){
        return cardService.getAll();
    }

    @GetMapping("/{id}")
    public Card getById(@PathVariable Integer id){
        return cardService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody CardDto cardDto){
        Result result = cardService.create(cardDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CardDto cardDto){
        Result result = cardService.update(id, cardDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = cardService.delete(id);
        return result;
    }
}
