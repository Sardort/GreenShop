package org.example.greenshop.model;

import jakarta.persistence.*;

@Entity(name = "shop_card")
public class Shopping_cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Product product_id;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String quantity;
    @Column(nullable = false)
    private String total;
    @Column(nullable = false)
    private String subtotal;
    @Column(nullable = false)
    private String shiping;
    @Column(nullable = false)
    private String total_cart;

    public Shopping_cart(Integer id, Product product_id, String price, String quantity, String total, String subtotal, String shiping, String total_cart) {
        this.id = id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.subtotal = subtotal;
        this.shiping = shiping;
        this.total_cart = total_cart;
    }

    public Shopping_cart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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

    public String getTotal_cart() {
        return total_cart;
    }

    public void setTotal_cart(String total_cart) {
        this.total_cart = total_cart;
    }

    @Override
    public String toString() {
        return "Shopping_cart{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", total='" + total + '\'' +
                ", subtotal='" + subtotal + '\'' +
                ", shiping='" + shiping + '\'' +
                ", total_cart='" + total_cart + '\'' +
                '}';
    }
}
