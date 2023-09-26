package pers.bol.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pers.bol")
public class SpringBootCoreStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCoreStart.class,args);
    }
}
