package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/adDetails")
public class AdDetails extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long adId = Long.parseLong(request.getParameter("adId"));
        request.setAttribute("adId", adId);
        Ad myAd = DaoFactory.getAdsDao().getAdDetails(adId);
        request.setAttribute("myAd", myAd);
        request.getRequestDispatcher("/WEB-INF/ads/adDetails.jsp").forward(request, response);
    }
}