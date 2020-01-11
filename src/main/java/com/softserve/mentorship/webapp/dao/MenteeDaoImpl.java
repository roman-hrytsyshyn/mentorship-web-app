package com.softserve.mentorship.webapp.dao;

import com.softserve.mentorship.webapp.entity.Mentee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MenteeDaoImpl implements MenteeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Mentee> getAll() {
        return getSession().createQuery("from Mentee", Mentee.class).getResultList();
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}