package com.sutiboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @className:com.sutiboot.config.AppConfiguration.java
 * @author <a href="mailto:balramc@****.**">Balram</a>
 * @date May 8, 2019 11:12:07 AM
 * @description:
 */
@Configuration
public class AppConfiguration {
	
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
