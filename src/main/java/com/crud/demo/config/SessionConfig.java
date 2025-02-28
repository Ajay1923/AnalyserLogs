package com.crud.demo.config;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.crud.demo.repository.UserRepository;
@Configuration
public class SessionConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/chatbot/**")
                .allowedOrigins("http://localhost:8080") // Adjust based on your frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
  
}
