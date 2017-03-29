package readproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(locations = "classpath:application.yaml", prefix="my")
public class Config {

    private List<String> servers;

    public Config() {
        this.servers = new ArrayList<String>();
        for( String prop: this.servers ){ System.out.println( prop ); }
    }
    //@Bean
    public List<String> getServers() {
        return this.servers;
    }
}