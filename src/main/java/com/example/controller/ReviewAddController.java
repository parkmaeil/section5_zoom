package com.example.controller;

import com.example.entity.ReviewDTO;
import com.example.repository.BookDAOMyBatis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addReview")
public class ReviewAddController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          req.setCharacterEncoding("utf-8");
          String cpath=req.getContextPath();
          // 번호,리뷰,평점
         int bookNum=Integer.parseInt(req.getParameter("bookNum"));
         String review=req.getParameter("review");
         int rating=Integer.parseInt(req.getParameter("rating")); // 1.0
        // 파라메터를 수집(DTO)
        ReviewDTO dto=new ReviewDTO();
        dto.setBook_num(bookNum);
        dto.setContent(review);
        dto.setRating(rating);

        BookDAOMyBatis dao=new BookDAOMyBatis();
        dao.reviewAdd(dto); //  성공
        resp.sendRedirect(cpath+"/view?num="+bookNum);
    }
}
