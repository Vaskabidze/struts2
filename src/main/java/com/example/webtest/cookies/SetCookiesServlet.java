package com.example.webtest.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("some_name", "Sasha");

        cookie1.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
