package pl.designuj.pi.first;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) throws BeansException, InterruptedException {
        SpringApplication.run(FirstApplication.class, args);
    }
}
