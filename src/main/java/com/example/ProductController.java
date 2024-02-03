package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping
    public Product save(@RequestBody final ProductRequest productRequest){
        return productService.save(productRequest);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    
}
