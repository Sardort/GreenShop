package org.example.greenshop.dto;

import jakarta.persistence.Column;

public class CategoryDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String desc;
    @Column(nullable = false)
    private String count;
    @Column(nullable = false)
    private String created_date;

    public CategoryDto(String name, String desc, String count, String created_date) {
        this.name = name;
        this.desc = desc;
        this.count = count;
        this.created_date = created_date;
    }

    public CategoryDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", count='" + count + '\'' +
                ", created_date='" + created_date + '\'' +
                '}';
    }
}
