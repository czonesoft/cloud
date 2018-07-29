package gkservices.authsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients  //(basePackages = {"com.czj.remote.api"})
@EnableDiscoveryClient
@SpringBootApplication
public class AuthsvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthsvcApplication.class, args);
    }
}
