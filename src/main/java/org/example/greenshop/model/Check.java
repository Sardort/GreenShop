package org.example.greenshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "checks")
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String order_number;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String total;
    @Column(nullable = false)
    private String payment_method;
    @OneToOne
    private Product product_id;
    @Column(nullable = false)
    private String quantity;
    @Column(nullable = false)
    private String subtotal;
    @Column(nullable = false)
    private String shiping;

//    public Check(Integer id, String order_number, String date, String total, String payment_method, Product product_id, String quantity, String subtotal, String shiping) {
//        this.id = id;
//        this.order_number = order_number;
//        this.date = date;
//        this.total = total;
//        this.payment_method = payment_method;
//        this.product_id = product_id;
//        this.quantity = quantity;
//        this.subtotal = subtotal;
//        this.shiping = shiping;
//    }
//
//    public Check() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOrder_number() {
//        return order_number;
//    }
//
//    public void setOrder_number(String order_number) {
//        this.order_number = order_number;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getTotal() {
//        return total;
//    }
//
//    public void setTotal(String total) {
//        this.total = total;
//    }
//
//    public String getPayment_method() {
//        return payment_method;
//    }
//
//    public void setPayment_method(String payment_method) {
//        this.payment_method = payment_method;
//    }
//
//    public Product getProduct_id() {
//        return product_id;
//    }
//
//    public void setProduct_id(Product product_id) {
//        this.product_id = product_id;
//    }
//
//    public String getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(String quantity) {
//        this.quantity = quantity;
//    }
//
//    public String getSubtotal() {
//        return subtotal;
//    }
//
//    public void setSubtotal(String subtotal) {
//        this.subtotal = subtotal;
//    }
//
//    public String getShiping() {
//        return shiping;
//    }
//
//    public void setShiping(String shiping) {
//        this.shiping = shiping;
//    }
//
//    @Override
//    public String toString() {
//        return "Check{" +
//                "id=" + id +
//                ", order_number='" + order_number + '\'' +
//                ", date='" + date + '\'' +
//                ", total='" + total + '\'' +
//                ", payment_method='" + payment_method + '\'' +
//                ", product_id=" + product_id +
//                ", quantity='" + quantity + '\'' +
//                ", subtotal='" + subtotal + '\'' +
//                ", shiping='" + shiping + '\'' +
//                '}';
//    }
}
