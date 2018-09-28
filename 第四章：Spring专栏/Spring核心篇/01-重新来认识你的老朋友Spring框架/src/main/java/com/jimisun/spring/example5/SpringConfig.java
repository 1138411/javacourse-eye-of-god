package com.jimisun.spring.example5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:40 2018-09-27
 * @Modified By:
 */
@Configuration
public class SpringConfig {

    @Bean
    public SleepAction sleepAction() {
        return new SleepAction();
    }

    @Bean
    public BeautifulGirl beautifulGirl() {
        return new BeautifulGirl(sleepAction());
    }
}
