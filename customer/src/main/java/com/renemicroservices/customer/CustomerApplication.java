package com.renemicroservices.customer;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.PropertySource;
        import org.springframework.context.annotation.PropertySources;
@SpringBootApplication(
        scanBasePackages = {

        }
)


public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}