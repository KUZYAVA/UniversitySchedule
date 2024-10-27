package ru.Kuzevanov_Alexander.NauJava.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.Kuzevanov_Alexander.NauJava.data.model.Log;

@Configuration
public class DataConfig {

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public List<Log> logContainer() {
        return new ArrayList<>();
    }
}
