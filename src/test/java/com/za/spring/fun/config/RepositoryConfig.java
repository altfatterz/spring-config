package com.za.spring.fun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Java based repository configuration.
 *
 * @author Zoltan Altfatter
 */
@Configuration
@Import(InfrastructureConfig.class)
@EnableJpaRepositories("com.za.spring.fun.repository")
public class RepositoryConfig {
}
