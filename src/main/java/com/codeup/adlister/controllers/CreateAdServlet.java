package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassCastException{
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }
        User user = new User();

    User currentUser = (User) request.getSession().getAttribute("user");

    if (currentUser != null){
        Ad ad = new Ad(
            currentUser.getId(),
            request.getParameter("title"),
            request.getParameter("description"),
<<<<<<< HEAD
                (java.sql.Date) new Date()
=======
          request.getParameter("date_created")
>>>>>>> main
        );
        DaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/ads");
        }
    }
}
