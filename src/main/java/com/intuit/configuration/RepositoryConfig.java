package com.intuit.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.intuit.repository", entityManagerFactoryRef="emf")
@EnableAutoConfiguration
public class RepositoryConfig {

}