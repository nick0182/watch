package com.shaidulin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.LinkedList;

@SpringBootApplication
public class WatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchApplication.class, args);
    }

    @Bean
    @Order(1)
    public Watch timer() {
        return new Watch() {
            @Override
            public String start() {
                return "Timer started";
            }

            @Override
            public String stop() {
                return "Timer stopped";
            }
        };
    }

    @Bean
    @Order(2)
    public Watch alarm() {
        return new Watch() {
            @Override
            public String start() {
                return "Alarm started";
            }

            @Override
            public String stop() {
                return "Alarm stopped";
            }
        };
    }

    @Bean
    @Order(3)
    public Watch clock() {
        return new Watch() {
            @Override
            public String start() {
                return "Clock started";
            }

            @Override
            public String stop() {
                return "Clock stopped";
            }
        };
    }

}
