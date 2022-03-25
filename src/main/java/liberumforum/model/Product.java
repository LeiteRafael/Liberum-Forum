package liberumforum.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    private String id;
    private String name;
    private double value;
    private String description;

}