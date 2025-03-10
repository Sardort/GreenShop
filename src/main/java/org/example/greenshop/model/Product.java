package org.example.greenshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.greenshop.model.entity.SizeRole;
import org.example.greenshop.model.entity.Status;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String size;
    @Enumerated(EnumType.STRING)
    private SizeRole sizeRole;
    @OneToOne
    private Card card_id;
    @Column(nullable = false)
    private String sku;
    @OneToOne
    private Category category_id;
    @Column(nullable = false)
    private String tags;
    @Column(nullable = false)
    private String reviews;

    @CreatedDate
    private LocalDateTime created_date = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private Status status;

    public Product(Integer id, String name, String price, String description, String size, SizeRole sizeRole, Card card_id, String sku, Category category_id, String tags, String reviews, LocalDateTime created_date, Status status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
        this.sizeRole = sizeRole;
        this.card_id = card_id;
        this.sku = sku;
        this.category_id = category_id;
        this.tags = tags;
        this.reviews = reviews;
        this.created_date = created_date;
        this.status = status;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public SizeRole getSizeRole() {
        return sizeRole;
    }

    public void setSizeRole(SizeRole sizeRole) {
        this.sizeRole = sizeRole;
    }

    public Card getCard_id() {
        return card_id;
    }

    public void setCard_id(Card card_id) {
        this.card_id = card_id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", sizeRole=" + sizeRole +
                ", card_id=" + card_id +
                ", sku='" + sku + '\'' +
                ", category_id=" + category_id +
                ", tags='" + tags + '\'' +
                ", reviews='" + reviews + '\'' +
                ", created_date=" + created_date +
                ", status=" + status +
                '}';
    }
}
