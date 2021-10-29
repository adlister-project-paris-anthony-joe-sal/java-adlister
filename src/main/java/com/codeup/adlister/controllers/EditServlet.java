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





        String title = request.getParameter("title");
        String description = request.getParameter("description");
        Timestamp date_created = (Timestamp) session.getAttribute("date_created");   /// assign each parameter to their data types respectively
        String category = request.getParameter("category");


      long adId = Long.parseLong(request.getParameter("ad-id")); // capture ad id from the current ad as a string
                                                                     // convert parameter id from string to a long

       Ad ad = DaoFactory.getAdsDao().attainAdId(adId); // Use DAOFactory to find ad by id & set new values to the ad
       ad.setTitle(title);
       ad.setDescription(description);
       ad.setDate(date_created);
       ad.setCategory(category);

       System.out.println(ad);
       DaoFactory.getAdsDao().edit( ad); // edit the ad using the edit() which uses an UPDATE query to return the rows affected
       response.sendRedirect("/ads");

       //        long currentUserId = (long) session.getAttribute("userId");
       //int currAd = (int) session.getAttribute("ad");
//        Ad newAd = new Ad(
//                currentUserId,
//                newTitle,
//                newDescription,
//                date_created,
//                newCategory
//        );
//        long adId = newAd.getId();

//        session.removeAttribute("ad");



    }
}