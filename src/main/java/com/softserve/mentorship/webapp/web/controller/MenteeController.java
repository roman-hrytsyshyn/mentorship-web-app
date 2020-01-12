package com.softserve.mentorship.webapp.web.controller;

import com.softserve.mentorship.webapp.root.entity.Mentee;
import com.softserve.mentorship.webapp.root.service.MenteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mentee")
public class MenteeController {

    @Autowired
    private MenteeService menteeService;

    @GetMapping("/healthcheck")
    public String welcome() {
        return "Welcome to MenteeController";
    }

    @GetMapping
    public List<Mentee> getAllMentees() {
        return menteeService.getAll();
    }
}
