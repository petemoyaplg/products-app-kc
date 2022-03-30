package ma.enset.productsapp;

import ma.enset.productsapp.entities.Product;
import ma.enset.productsapp.repositories.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        Product product = new Product();
        return args -> {
            long id = 1;
            product.setId(id);
            product.setName("Computer");
            product.setPrice(7600);
            product.setQuantity(34);
            productRepository.save(product);
            id = 2;
            product.setId(id);
            product.setName("Printer");
            product.setPrice(1600);
            product.setQuantity(134);
            productRepository.save(product);
            id = 3;
            product.setId(id);
            product.setName("Smartphone");
            product.setPrice(1600);
            product.setQuantity(34);
            productRepository.save(product);
        };
    }

}
