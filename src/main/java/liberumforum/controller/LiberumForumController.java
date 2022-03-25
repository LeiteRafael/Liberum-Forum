package liberumforum.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({ "/api" })
public class LiberumForumController {

    @CrossOrigin
    @GetMapping("/users")
    public List<String> getProduct(){
        return List.of("Rafael", "Joao");
    }


}
