package org.example.greenshop.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ProductDto {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String sku;
    @Column(nullable = false)
    private String tags;
    @Column(nullable = false)
    private String reviews;

    @Column(nullable = false)
    private String status;

    public ProductDto(String name, String price, String description, String size, String sku, String tags, String reviews, String status) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
        this.sku = sku;
        this.tags = tags;
        this.reviews = reviews;

        this.status = status;
    }

    public ProductDto() {
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", sku='" + sku + '\'' +
                ", tags='" + tags + '\'' +
                ", reviews='" + reviews + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
