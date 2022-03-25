package liberumforum.repository;

import liberumforum.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{ 'name' : ?0 }")
    List<Product> getProductsByName(String name);

    // Aqui vai consultas mais elaboradas, que sao implementadas pelo MongoRepository
}