package webcontrollers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ExampleController {

    @Value(value = "${name}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @RequestMapping("/ExampleController/{id}")
    String home(@PathVariable String id ) {
        return "Hello World!|"
                + "\n id = " + id
                + ", getName() = " + getName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleController.class, args);
    }

}
