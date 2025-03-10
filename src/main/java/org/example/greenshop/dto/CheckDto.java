package org.example.greenshop.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.greenshop.model.Product;

public class CheckDto {

    @Column(nullable = false)
    private String order_number;
    @Column(nullable = false)
    private String total;
    @Column(nullable = false)
    private String payment_method;
    @Column(nullable = false)
    private String quantity;
    @Column(nullable = false)
    private String subtotal;
    @Column(nullable = false)
    private String shiping;

    public CheckDto(String order_number, String total, String payment_method, String quantity, String subtotal, String shiping) {
        this.order_number = order_number;
        this.total = total;
        this.payment_method = payment_method;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.shiping = shiping;
    }

    public CheckDto() {
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getShiping() {
        return shiping;
    }

    public void setShiping(String shiping) {
        this.shiping = shiping;
    }

    @Override
    public String toString() {
        return "CheckDto{" +
                "order_number='" + order_number + '\'' +
                ", total='" + total + '\'' +
                ", payment_method='" + payment_method + '\'' +
                ", quantity='" + quantity + '\'' +
                ", subtotal='" + subtotal + '\'' +
                ", shiping='" + shiping + '\'' +
                '}';
    }
}
