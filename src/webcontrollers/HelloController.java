package webcontrollers;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!+1r" + new Date();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    @ResponseBody
    public String index1() {
        return "Greetings from Spring Boot!+2" + new Date();
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("spring.devtools.remote.secret", "true");
        SpringApplication app = new SpringApplication(HelloController.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        //SpringApplication.run(HelloController.class, args);

        ApplicationArguments args1;

    }


}