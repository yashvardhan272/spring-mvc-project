package frontend.mvc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Bean("restTemplate")
    public RestTemplate getRestTemplate()
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
