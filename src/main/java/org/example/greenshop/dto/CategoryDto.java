package org.example.greenshop.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CategoryDto {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String count;

    public CategoryDto(String name, String description, String count) {
        this.name = name;
        this.description = description;
        this.count = count;
    }

    public CategoryDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
