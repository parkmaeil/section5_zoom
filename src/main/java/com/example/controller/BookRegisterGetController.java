package com.example.controller;


import com.example.entity.BookDTO;
import com.example.repository.BookDAOMyBatis;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
// http://localhost:8081/MF01/registerGet
@WebServlet("/registerGet")
public class BookRegisterGetController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                                                           throws ServletException, IOException {

        // View와 연동하는 부분
        // forward, dispatcher
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/register.jsp");
        rd.forward(req, resp);

    }
}
