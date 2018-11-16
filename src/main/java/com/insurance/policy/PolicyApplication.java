package com.insurance.policy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan(basePackages = "com.insurance.policy.repository")
@SpringBootApplication
public class PolicyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PolicyApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PolicyApplication.class);
    }
}
