package org.example.greenshop.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CardDto {
    @Column(nullable = false)
    private String type;
    @Column(nullable = false,unique = true)
    private String card_number;
    @Column(nullable = false)
    private String card_date;
    @Column(nullable = false)
    private String cvv;

    public CardDto(String type, String card_number, String card_date, String cvv) {
        this.type = type;
        this.card_number = card_number;
        this.card_date = card_date;
        this.cvv = cvv;
    }

    public CardDto() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_date() {
        return card_date;
    }

    public void setCard_date(String card_date) {
        this.card_date = card_date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CardDto{" +
                "type='" + type + '\'' +
                ", card_number='" + card_number + '\'' +
                ", card_date='" + card_date + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
