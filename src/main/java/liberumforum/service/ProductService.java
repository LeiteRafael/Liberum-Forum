package liberumforum.service;

import liberumforum.model.Product;
import liberumforum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductByName(String name) {
        return productRepository.getProductsByName(name);
    }

    public Product storeProduct(Product product) {
        return productRepository.save(product);
    }

}
