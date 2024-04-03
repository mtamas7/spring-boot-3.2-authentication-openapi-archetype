package com.divide.by.zero.security.annotation;

import com.divide.by.zero.security.config.SecurityModuleConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(SecurityModuleConfiguration.class)
@Configuration
public @interface EnableSecurityModule {
}
