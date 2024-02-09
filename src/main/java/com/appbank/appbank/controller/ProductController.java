package com.appbank.appbank.controller;

import com.appbank.appbank.api.IProductService;
import com.appbank.appbank.model.dto.ProductDTO;
import com.appbank.appbank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping
    public String testController(){
        return "Controller works!";
    }

    @PostMapping
    public String testPostController(@RequestBody String name){
        return "Controller post works! "+ name;
    }

    @PostMapping(value = "/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO productDTO){
        return productService.queryProduct(productDTO);
    }

    @GetMapping(value = "/getAll")
    public List<ProductDTO> queryAllProducts(){
        return productService.queryAllProducts();
    }

    @PostMapping(value = "/add")
    public int addProduct(@RequestBody ProductDTO productDTO){
        return productService.insertProduct(productDTO);
    }

    @PutMapping(value = "/update")
    public int updateProduct(@RequestBody ProductDTO productDTO){
        return productService.updateProduct(productDTO);
    }

    @DeleteMapping(value = "/delete")
    public int deleteProduct(@RequestBody ProductDTO productDTO){
        return productService.deleteProduct(productDTO);
        }


}
