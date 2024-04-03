package com.divide.by.zero.security.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.divide.by.zero")
@EnableJpaRepositories(basePackages = "com.divide.by.zero")
@EntityScan(basePackages = "com.divide.by.zero")
public class SecurityModuleConfiguration {
}
