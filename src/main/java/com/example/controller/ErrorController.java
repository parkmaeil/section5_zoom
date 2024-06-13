package com.example.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

@WebServlet("/error")
public class ErrorController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                                                                  throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String msgCode=req.getParameter("msg");
        String messageKey="error."+msgCode; // error.1

        ResourceBundle messages=ResourceBundle.getBundle("message", req.getLocale());
        String errorMessage=messages.getString(messageKey);

        req.setAttribute("errorMessage",errorMessage);
        RequestDispatcher rd =req.getRequestDispatcher("/WEB-INF/views/error.jsp");
        rd.forward(req, resp);

    }
}
