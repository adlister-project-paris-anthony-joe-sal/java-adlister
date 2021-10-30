package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("ads", DaoFactory.getAdsDao().all());
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sortOption = request.getParameter("date");
        if (sortOption.equalsIgnoreCase("oldToNew")) {
            request.setAttribute("ads", DaoFactory.getAdsDao().sortAds());
            request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
        } else if (sortOption.equalsIgnoreCase("newToOld")) {
            System.out.println("This is an else if");
            request.setAttribute("ads", DaoFactory.getAdsDao().sortAdsAscending());
            request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
        }
//        System.out.println(sortOption);
//        System.out.println("You clicked the sort button");
    }
}
