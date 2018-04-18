package com.sorsix.interns;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.sorsix.interns")
public class DemoConfiguration {

    @Bean
    public Engine engine() {
        System.out.println("creating engine");
        return new OtoEngine(100);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Transmission transmission() {
        System.out.println("creating transmission");
        return new Transmission("auto");
    }
}
