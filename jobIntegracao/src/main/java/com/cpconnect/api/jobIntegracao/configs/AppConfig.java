package com.cpconnect.api.jobIntegracao.configs;

import com.cpconnect.api.jobIntegracao.services.ResNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ResNotificationService resNotificationService() {
        return new ResNotificationService();
    }
}

