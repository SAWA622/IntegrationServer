package com.tietoevry.teis.core.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
import java.sql.Connection;
import javax.annotation.PostConstruct;
import java.util.TimeZone;

import org.quartz.Scheduler;
import org.quartz.SchedulerMetaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication()
@EnableScheduling
public class SchedulerApplication {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerApplication.class);

    public static void main(String args[]) {
        SpringApplication.run(SchedulerApplication.class, args);
        logger.info("Scheduler Application started with ELK logging enabled");
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
        logger.info("Application initialized with timezone: {}", TimeZone.getDefault().getID());
    }

    @Bean
    public CommandLineRunner checkDatabaseConnection(DataSource dataSource) {
        return args -> {
            logger.info("Attempting to connect to database...");
            try (Connection connection = dataSource.getConnection()) {
                logger.info("Database connection SUCCESSFUL!");
                logger.info("Database URL: {}", connection.getMetaData().getURL());
                logger.info("Database username: {}", connection.getMetaData().getUserName());
                logger.info("Database product: {}", connection.getMetaData().getDatabaseProductName());
                logger.info("Database version: {}", connection.getMetaData().getDatabaseProductVersion());
            } catch (Exception e) {
                logger.error("Database connection FAILED!", e);
            }
        };
    }

    @Bean
    public CommandLineRunner debugQuartzConfig(Scheduler scheduler) {
        return args -> {
            SchedulerMetaData metaData = scheduler.getMetaData();
            logger.info("=== Quartz Configuration ===");
            logger.info("Scheduler: {}", metaData.getSchedulerName());
            logger.info("JobStore: {}", metaData.getJobStoreClass().getName());
            logger.info("Supports Persistence: {}", metaData.isJobStoreSupportsPersistence());
            logger.info("ThreadPool: {}", metaData.getThreadPoolClass().getName());
        };
    }
}