package com.neri.carapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200") // Permita todos os domínios
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Permita métodos específicos
                        .allowedHeaders("*") // Permita todos os cabeçalhos
                        .allowCredentials(true); // Permita credenciais (cookies, autenticação, etc.)
            }
        };
    }
}

