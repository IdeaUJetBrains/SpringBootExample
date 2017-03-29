package webcontrollers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import readproperties.Config;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
public class SpringProfilesTest {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Config.class, "--spring.profiles.active=B");
    }
}
