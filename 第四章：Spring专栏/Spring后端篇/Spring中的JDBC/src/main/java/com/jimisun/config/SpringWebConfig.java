package com.jimisun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:03 2018-10-25
 * @Modified By:
 */
@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@ComponentScan("com.jimisun.controller")
public class SpringWebConfig extends WebMvcConfigurerAdapter {

/*    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setViewClass(JstlView.class);
        return internalResourceViewResolver;
    }*/


    /**
     * {@inheritDoc}
     * <p>This implementation is empty.
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


}
