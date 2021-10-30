

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


@WebServlet("/editAd")
public class EditAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Long adId = Long.parseLong(request.getParameter("adId"));
        request.setAttribute("adId", adId);
        Ad myAd = DaoFactory.getAdsDao().getAdDetails(adId);
        request.setAttribute("myAd", myAd);
        request.getRequestDispatcher("/WEB-INF/ads/edit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long adId = Long.parseLong(request.getParameter("adId"));
        request.setAttribute("adId", adId);
        HttpSession session = request.getSession();


        String title = request.getParameter("title");
        String description = request.getParameter("description");
        Timestamp date_created = (Timestamp) session.getAttribute("date_created");   /// assign each parameter to their data types respectively
        //       String category = request.getParameter("category");


        // capture ad id from the current ad as a string
        // convert parameter id from string to a long


        Ad ad = DaoFactory.getAdsDao().getAdDetails(adId); // Use DAOFactory to find ad by id & set new values to the ad

        DaoFactory.getAdsDao().edit(title, description, adId); // edit the ad using the edit() which uses an UPDATE query to return the rows affected

        response.sendRedirect("/profile");




    }
}






