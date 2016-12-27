package webcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class OnlyRequestMapping {
    ExampleController fff;
    HelloController ttt;

    @Autowired
    public OnlyRequestMapping(ExampleController fff) {
        this.fff = fff;
    }
    @Autowired
    public OnlyRequestMapping(HelloController ttt) {
        this.ttt = ttt;
    }

    @RequestMapping("/OnlyRequestMapping")
    public String index() {
        return "OnlyRequestMapping";
    }
}
