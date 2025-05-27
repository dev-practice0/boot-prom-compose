package org.example.bootpromcompose;

import io.micrometer.core.annotation.Counted;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountedController {

    @Counted(value = "give.me.money", description = "부자가 되고 싶어요")
    @GetMapping("/counted")
    public String getCounted() {
        return "Counted OK";
    }

    @GetMapping("/error")
    public String getError() {
        throw new RuntimeException("Error!"); // 500
    }
}