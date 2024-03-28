package com.example.expense.tracker.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@TestConfiguration
@EnableJpaRepositories(basePackages = {"com.example.expense.tracker.repository"})
public class TestRepositoryConfig {

    // Define any beans or configurations needed for testing

    // Example bean definition for configuring EntityManagerFactory or DataSource
    // Uncomment and customize as needed

//    @Bean
//    public EntityManagerFactory entityManagerFactory() {
//        // Define EntityManagerFactory bean for testing
//        // Customize according to your test requirements
//        return ...
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        // Define DataSource bean for testing
//        // Customize according to your test requirements
//        return ...
//    }
}
