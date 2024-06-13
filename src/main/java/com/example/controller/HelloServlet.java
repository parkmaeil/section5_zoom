package com.example.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
// http://localhost:8081/MF01/hello
@WebServlet("/hello") // Servlet Mapping(web.xml)
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                                                           throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("Hello Servlet");
    }
}
