package com.dango.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GulimallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // 1. 配置跨域
        // 1) 允许哪些请求头跨域
        corsConfiguration.addAllowedHeader("*");
        // 2) 允许哪些请求方式跨域
        corsConfiguration.addAllowedMethod("*");
        // 3) 允许哪些原始域名跨域
        corsConfiguration.addAllowedOriginPattern("*");
        // 4) 是否允许携带cookie跨域
        corsConfiguration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(source);
    }
}
