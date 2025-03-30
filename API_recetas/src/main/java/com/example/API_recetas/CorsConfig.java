package com.example.API_recetas;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite todas las peticiones CORS desde cualquier origen (puedes restringirlo a un dominio si lo prefieres)
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500")  // Cambia esto por tu URL de frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite los métodos que deseas
                .allowedHeaders("*"); // Permite todos los headers
    }
}
