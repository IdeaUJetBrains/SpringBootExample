package webcontrollers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import readproperties.Config;

@RestController
@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
public class ExampleControllerYaml {



   /* @Autowired
    private Config listConfig;*/


    @RequestMapping("/ExampleController/{id}")
    String home(@PathVariable String id ) {

        return "Hello World!|"
                + "\n id = " + id
                + ", Config().getServers() = " + new Config().getServers();


       // for( String prop: listConfig ){ System.out.println( prop ); }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleControllerYaml.class, args);
    }

}
