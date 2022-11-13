package com.example.webtest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

public class Redirect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String param = request.getParameter("param");

        if (Objects.equals(param, "google")) {
            response.sendRedirect("https://www.google.com/");
        } else {
            response.sendRedirect("/WebTest_war_exploded/firstJsp.jsp");
        }
    }
}
