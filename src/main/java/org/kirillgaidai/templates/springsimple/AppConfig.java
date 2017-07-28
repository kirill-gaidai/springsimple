package org.kirillgaidai.templates.springsimple;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public AppBean appBean() {
        return new AppBean();
    }

}
