package ir.mmahdisz.testjardeploy;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping
    public String test(
            @RequestParam String name,
            @RequestParam String family

    ) {
        return name + " -> " + family;
    }


}
