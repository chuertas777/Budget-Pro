package com.budget.budgetpro.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Configuración de CORS (Cross-Origin Resource Sharing) para permitir 
 * solicitudes desde un origen específico.
 */

@Configuration
public class CorsConfiguracion {
    
    /**
     * Configura y crea un filtro CORS para permitir solicitudes desde el origen 
     * http://localhost:5500.
     *
     * @return CorsFilter que permite solicitudes CORS desde el origen especificado.
     */
    
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        
        // Configurar el origin permitido (frontend)
        config.addAllowedOrigin("http://localhost:5500");
        
        // Métodos HTTP permitidos
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("OPTIONS"); // Necesario para las preflight requests
        
        // Permitir todas las cabeceras
        config.addAllowedHeader("*");
        
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
    
}
