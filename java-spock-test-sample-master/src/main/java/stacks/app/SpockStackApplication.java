package stacks.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "stacks.spock")
public class SpockStackApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpockStackApplication.class, args);
    }

}
