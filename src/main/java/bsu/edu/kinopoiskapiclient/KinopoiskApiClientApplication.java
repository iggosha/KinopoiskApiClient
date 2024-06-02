package bsu.edu.kinopoiskapiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KinopoiskApiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(KinopoiskApiClientApplication.class, args);
    }

}
