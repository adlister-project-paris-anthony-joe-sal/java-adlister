


package com.codeup.adlister.controllers;

        import com.codeup.adlister.dao.DaoFactory;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;


@WebServlet(name = "controlers.DeleteAdServlet", urlPatterns = "/delete")
public class DeleteAdServlet extends HttpServlet {

//    Ads dao = DaoFactory.getAdsDao();

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("ads", DaoFactory.getAdsDao().all());
//
//        request.getRequestDispatcher("/WEB-INF/ads/showDelete.jsp")
//                .forward(request, response);
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("deleteAd");
         DaoFactory.getAdsDao().delete(id);;
//        dao.delete(id);

        response.sendRedirect("/ads");
    }

}