package com.product.ProductManagerAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.product.ProductManagerAPI.models.Product;

@RestController
public class ProductController implements WebMvcConfigurer{

    private final List<Product> productos = new ArrayList<>();

    public ProductController() {
        productos.add(new Product("Producto 1", "Descripción del producto 1", 10, "Categoría 1"));
    }

    @GetMapping("/product")
    public List<Product> obtenerTodosLosProductos() {
        return productos;
    }
    
}
