package org.example.servlet.Lesson5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "NameServlet",urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        if (name == null || surname == null) {
            resp.sendError(HttpServletResponse.SC_CONFLICT);
        }
        req.setAttribute("name",name);
        req.setAttribute("surname",surname);
        getServletContext().getRequestDispatcher("/name.jsp").forward(req, resp);
//        resp.setContentType("text/html");
//        resp.getWriter().write("<html><body><h1>"+name+"</h1></body></html>");
//        resp.getWriter().write("<html><body><h1>"+surname+"</h1></body></html>");
    }
}
