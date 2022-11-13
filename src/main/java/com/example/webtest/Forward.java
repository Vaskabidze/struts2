package com.example.webtest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Forward extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("dsd", 3);

//  TODO   тоже самое
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/firstJsp.jsp");
//        dispatcher.forward(request, response);

        getServletContext().getRequestDispatcher("/firstJsp.jsp").forward(request, response);
    }
}
