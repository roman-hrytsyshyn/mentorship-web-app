package com.softserve.mentorship.webapp.root.service;

import com.softserve.mentorship.webapp.root.dao.MenteeDao;
import com.softserve.mentorship.webapp.root.entity.Mentee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenteeServiceImpl implements MenteeService {

    @Autowired
    private MenteeDao menteeDao;

    @Override
    public List<Mentee> getAll() {
        return menteeDao.getAll();
    }
}
