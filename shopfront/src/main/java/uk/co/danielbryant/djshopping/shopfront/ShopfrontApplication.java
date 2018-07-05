package uk.co.danielbryant.djshopping.shopfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
public class ShopfrontApplication {
	// main function
    public static void main(String[] args) {
        SpringApplication.run(ShopfrontApplication.class, args);
    }

    @Bean(name = "stdRestTemplate")
    public RestTemplate getRestTemplate() {
    	int a = 1;
        return new RestTemplate();
    }
}
