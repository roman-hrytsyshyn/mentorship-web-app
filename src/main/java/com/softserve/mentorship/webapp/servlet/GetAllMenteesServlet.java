package com.softserve.mentorship.webapp.servlet;

import com.google.gson.Gson;
import com.softserve.mentorship.webapp.entity.Mentee;
import com.softserve.mentorship.webapp.service.MenteeService;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/mentee")
public class GetAllMenteesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = (ApplicationContext) req.getServletContext().getAttribute("applicationContext");
        MenteeService service = applicationContext.getBean(MenteeService.class);

        List<Mentee> mentees = service.getAll();
        String menteesJson = new Gson().toJson(mentees);

        resp.setContentType("application/json");
        resp.getWriter().write(menteesJson);
    }
}
