package pers.shane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Example {
    @RequestMapping("/")
    String home(){
        return "hello git master V0.3";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Example.class);
    }

}
