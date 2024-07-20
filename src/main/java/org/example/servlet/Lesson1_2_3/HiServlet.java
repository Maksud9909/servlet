package org.example.servlet.Lesson1_2_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "HiServlet", urlPatterns = "/hi")
public class HiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("The GET method has been made to /hi");

        resp.setContentType("text/jsp"); // what should we get with response
        resp.encodeRedirectURL("webapp/index.jsp");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("The POST method has been made to /hi");
        resp.getWriter().write("Post request to HiServlet");
    }
}
