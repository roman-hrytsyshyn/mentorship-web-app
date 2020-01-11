package com.softserve.mentorship.webapp.config;

import com.softserve.mentorship.webapp.servlet.GetAllMenteesServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

public class MyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext container) throws ServletException {
        container.addServlet("menteeServlet", new GetAllMenteesServlet());

        //make Spring ApplicationContext available to Servlets via ServletContext
        container.addListener(new SpringContextLoader());
    }
}
