package jikanganai.server;

import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    /**
     * Customise the physical naming strategy to use for Hibernate.
     *
     * @return
     */
    @Bean
    public PhysicalNamingStrategy physical() {
        return new CamelCasePhysicalNamingStrategy();
    }

}
