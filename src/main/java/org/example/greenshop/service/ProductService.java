package org.example.greenshop.service;

import org.example.greenshop.dto.ProductDto;
import org.example.greenshop.model.Category;
import org.example.greenshop.model.Product;
import org.example.greenshop.model.Result;
import org.example.greenshop.model.entity.SizeRole;
import org.example.greenshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    //getAll
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    //getById
    public Product getById(Integer id){
        return productRepository.findById(id).get();
    }

    //create
    public Result create(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDesc(productDto.getDesc());
        product.setSize(String.valueOf(SizeRole.S));
        product.setSku(productDto.getSku());
        product.setTags(productDto.getTags());
        product.setReviews(productDto.getReviews());
        product.setCreated_date(productDto.getCreated_date());
        product.setStatus(productDto.getStatus());
        productRepository.save(product);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, ProductDto productDto){
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()){
            Product product = productOptional.get();
            product.setName(productDto.getName());
            product.setPrice(productDto.getPrice());
            product.setDesc(productDto.getDesc());
            product.setSize(String.valueOf(SizeRole.S));
            product.setSku(productDto.getSku());
            product.setTags(productDto.getTags());
            product.setReviews(productDto.getReviews());
            product.setCreated_date(productDto.getCreated_date());
            product.setStatus(productDto.getStatus());
            productRepository.save(product);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        productRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
