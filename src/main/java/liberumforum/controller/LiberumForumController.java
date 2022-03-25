package liberumforum.controller;

import liberumforum.model.Product;
import liberumforum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({"/api"})
public class LiberumForumController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/products")
    public List<Product> listProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/products", params = "name")
    public List<Product> getProductsByName(@RequestParam String name) {
        return productService.getProductByName(name);
    }

    @PostMapping("/products")
    public Product storeProduct(@RequestBody Product product) {
        return productService.storeProduct(product);
    }

}