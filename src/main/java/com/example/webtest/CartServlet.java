package com.example.webtest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("Cart");

        if (cart == null) {
            cart = new Cart();
            cart.name = request.getParameter("name");
            cart.quantity = Long.parseLong(request.getParameter("quantity"));
        }

        session.setAttribute("Cart", cart);

        getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);

    }
}
