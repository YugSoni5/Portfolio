 package com.yugsoni.Portfolio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/contacts/all").authenticated()
                        .anyRequest().permitAll()
                )
                .formLogin(form -> form.loginPage("/login").permitAll())
                .httpBasic(httpBasic -> {
                }); // <-- properly chained

        return http.build();
    }
}

/*
 *
 * This code is just for SECURITY PURPOSE .
 *
 * ALSO, THIS LAYER IS OPTIONAL.
 * */
