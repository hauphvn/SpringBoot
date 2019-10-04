package hauphvn.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {

    @GetMapping("/api/test")
    public ResponseEntity<String> TestSpringBoot(){
        return ResponseEntity.ok("Success");
    }
}
