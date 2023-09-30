package me.livro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@EntityScan(basePackages = "me.livro.model")
public class LivrosPorAnoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LivrosPorAnoApplication.class, args);
    }
}