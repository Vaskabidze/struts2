package com.example.webtest.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");

        for (Cookie cookie : cookies) {
            printWriter.println("<h1>" + "Name: " + cookie.getName() + " value: " + cookie.getValue() + "</h1>");
        }

        printWriter.println("</html>");
    }
}
