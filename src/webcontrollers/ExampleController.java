package webcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import readproperties.Config;

import java.util.ArrayList;
import java.util.List;

@RestController
@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
public class ExampleController {

    @Value(value = "${name}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* @Autowired
    private Config listConfig;*/


    @RequestMapping("/ExampleController/{id}")
    String home(@PathVariable String id ) {

        return "Hello World!|"
                + "\n id = " + id
                + ", getName() = " + getName()
                + ", Config().getServers() = " + new Config().getServers();


       // for( String prop: listConfig ){ System.out.println( prop ); }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleController.class, args);
    }

}
