package com.softserve.mentorship.webapp;

import com.softserve.mentorship.webapp.root.config.DBConfig;
import com.softserve.mentorship.webapp.root.dao.MenteeDao;
import com.softserve.mentorship.webapp.root.entity.Mentee;
import com.softserve.mentorship.webapp.root.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class, AppConfig.class);

        MenteeDao menteeDao = ctx.getBean(MenteeDao.class);

        List<Mentee> mentees = menteeDao.getAll();

        System.out.println(mentees);
    }
}
