package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }

        //get current User
        User currentUser = (User) request.getSession().getAttribute("user");


        request.setAttribute("ads", DaoFactory.getAdsDao().all());
     request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
//        request.getRequestDispatcher("WEB-INF/ads/adsDetail.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sortOption = request.getParameter("date");
        if (sortOption.equalsIgnoreCase("oldToNew")) {
            request.setAttribute("ads", DaoFactory.getAdsDao().sortAds());
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        } else if (sortOption.equalsIgnoreCase("newToOld")) {
            System.out.println("This is an else if");
            request.setAttribute("ads", DaoFactory.getAdsDao().sortAdsAscending());
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }
//        System.out.println(sortOption);
//        System.out.println("You clicked the sort button");
    }




}
