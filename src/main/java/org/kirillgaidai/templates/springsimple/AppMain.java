package org.kirillgaidai.templates.springsimple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    final private static Logger LOGGER = LogManager.getLogger(AppMain.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AppBean appBean = applicationContext.getBean(AppBean.class);
        LOGGER.info(appBean.getMessage());
    }

}
