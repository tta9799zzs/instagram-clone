package com.anhtrt.instagramclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan({"com.anhtrt.instagramclone.mapper"})
@EnableJpaRepositories("com.anhtrt.instagramclone.repositorys")
public class InstagramCloneApplication extends SpringBootServletInitializer {

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(InstagramCloneApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(InstagramCloneApplication.class, args);
    }

}
