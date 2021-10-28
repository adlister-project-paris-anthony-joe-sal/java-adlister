package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int currAd = Integer.parseInt(request.getParameter("editAd"));
        session.setAttribute("currentAd", currAd);
        request.getRequestDispatcher("/WEB-INF/ads/edit.jsp").forward(request, response);


    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int currAd = (int) session.getAttribute("currentAd");
        String newTitle = request.getParameter("newTitle");
        String newDescription = request.getParameter("newDescription");
        Timestamp date_created = (Timestamp) session.getAttribute("date_created");
        String newCategory = request.getParameter("newCategory");
        long currentUserId = (long) session.getAttribute("userId");
        Ad newAd = new Ad(
                currentUserId,
                newTitle,
                newDescription,
                date_created,
                newCategory
        );
        DaoFactory.getAdsDao().edit(currAd, newAd);
        session.removeAttribute("currentAd");
        response.sendRedirect("/ads");
    }
}
