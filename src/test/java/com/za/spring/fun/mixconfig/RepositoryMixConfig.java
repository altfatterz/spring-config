package com.za.spring.fun.mixconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Java and XML based repository configuration.
 *
 * @author Zoltan Altfatter
 */
@Configuration
@ImportResource("config/infrastructure-config.xml")
@EnableJpaRepositories("com.za.spring.fun.repository")
public class RepositoryMixConfig {
}
