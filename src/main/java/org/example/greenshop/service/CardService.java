package org.example.greenshop.service;

import org.example.greenshop.dto.CardDto;
import org.example.greenshop.model.Card;
import org.example.greenshop.model.Result;
import org.example.greenshop.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    //getAll
    public List<Card> getAll(){
        return cardRepository.findAll();
    }

    //getById
    public Card getById(Integer id){
        return cardRepository.findById(id).get();
    }

    //create
    public Result create(CardDto cardDto){
        Card card = new Card();
        card.setType(cardDto.getType());
        card.setCard_number(card.getCard_number());
        card.setCard_date(cardDto.getCard_date());
        card.setCvv(cardDto.getCvv());
        cardRepository.save(card);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, CardDto cardDto){
        Optional<Card> cardOptional = cardRepository.findById(id);
        if (cardOptional.isPresent()){
            Card card = cardOptional.get();
            card.setType(cardDto.getType());
            card.setCard_number(card.getCard_number());
            card.setCard_date(cardDto.getCard_date());
            card.setCvv(cardDto.getCvv());
            cardRepository.save(card);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not Found");
    }

    //delete
    public Result delete(Integer id){
        cardRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
