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


@WebServlet("/edit")
public class EditServlet extends HttpServlet{
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //int currAd = (int) session.getAttribute("ad");

        String newTitle = request.getParameter("title");
        String newDescription = request.getParameter("description");
        Timestamp date_created = (Timestamp) session.getAttribute("date_created");
       System.out.println(date_created);
        String newCategory = request.getParameter("category");
       System.out.println(newCategory);
        long currentUserId = (long) session.getAttribute("userId");
       System.out.println(currentUserId);


        Ad newAd = new Ad(
                currentUserId,
                newTitle,
                newDescription,
                date_created,
                newCategory
        );
        long adId = newAd.getId();
        DaoFactory.getAdsDao().edit(adId, newAd);
        session.removeAttribute("ad");
        response.sendRedirect("/ads");
    }
}