package com.softserve.mentorship.webapp.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringContextLoader implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        servletContextEvent.getServletContext().setAttribute("applicationContext", ac);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
