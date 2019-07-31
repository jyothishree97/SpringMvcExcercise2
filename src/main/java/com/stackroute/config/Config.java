package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.stackroute"})
//@ComponentScan tells Spring in which packages you have annotated classes which should be managed by Spring.
@EnableWebMvc
//It enables support for @Controller-annotated classes that use @RequestMapping to map incoming requests to a certain method.
public class Config {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/Views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
