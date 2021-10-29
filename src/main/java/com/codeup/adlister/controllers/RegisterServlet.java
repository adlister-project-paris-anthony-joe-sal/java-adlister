package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");
        long zip_code = Long.parseLong(request.getParameter("zip_code"));
        long phone_number = Long.parseLong(request.getParameter("phone_number"));

        // validate input
        boolean inputHasErrors = username.isEmpty()
                || email.isEmpty()
                || password.isEmpty()
                || (! password.equals(passwordConfirmation));

        if (inputHasErrors || username.length() <= 7 ) {
            response.sendRedirect("/register");
            return;
        }

        // create and save a new user
        User user = new User(username, email, password, zip_code, phone_number);
        DaoFactory.getUsersDao().insert(user);
        response.sendRedirect("/login");
    }
}













































//
//
//package com.codeup.adlister.controllers;
//
//import com.codeup.adlister.dao.DaoFactory;
//import com.codeup.adlister.models.User;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
//public class RegisterServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String passwordConfirmation = request.getParameter("confirm_password");
//        long zip_code = Long.parseLong(request.getParameter("zip_code"));
//        long phone_number = Long.parseLong(request.getParameter("phone_number"));
//
//        // validate input
//        boolean inputHasErrors = username.isEmpty()
//                || email.isEmpty()
//                || password.isEmpty()
//                || (! password.equals(passwordConfirmation));
//
//        if (inputHasErrors) {
//            response.sendRedirect("/register");
//            return;
//        }
//
//        // create and save a new user
//        User user = new User(username, email, password, zip_code, phone_number);
//        DaoFactory.getUsersDao().insert(user);
//        response.sendRedirect("/login");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.codeup.adlister.controllers;
////
////import com.codeup.adlister.dao.Config;
////import com.codeup.adlister.dao.DaoFactory;
////import com.codeup.adlister.dao.MySQLUsersDao;
////import com.codeup.adlister.dao.Users;
////import com.codeup.adlister.models.User;
////
////import javax.servlet.ServletException;
////import javax.servlet.annotation.WebServlet;
////import javax.servlet.http.HttpServlet;
////import javax.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletResponse;
////import java.io.IOException;
////
////@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
////public class RegisterServlet extends HttpServlet {
////    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
////    }
////
////    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
////        String username = request.getParameter("username");
////        String firstName = request.getParameter("first_name");
////        String lastName = request.getParameter("last_name");
////        String email = request.getParameter("email");
////        String password = request.getParameter("password");
////        String passwordConfirmation = request.getParameter("confirm_password");
////        String zipCode = request.getParameter("zip_code");
////        String phoneNumber = request.getParameter("phone_number");
////
////        // validate input
////        boolean inputHasErrors = username.isEmpty()
//////                || firstName.isEmpty()
//////                || lastName.isEmpty()
////                || email.isEmpty()
////                || password.isEmpty()
////                || (!password.equals(passwordConfirmation));
////
//////                || zipCode.isEmpty()
//////                || phoneNumber.isEmpty();
////
////
////        if (inputHasErrors) {
////            response.sendRedirect("/register");
////            return;
////        }
////
////        // create and save a new user
//////        User user = new User(username,firstName,lastName, email, password,zipCode,phoneNumber);
//////        DaoFactory.getUsersDao().insert(user);
//////        response.sendRedirect("/login");
//////    }
////
////        User user = new User(username, firstName, lastName, email, password, zipCode, phoneNumber);
////                //        if (DaoFactory.getUsersDao().findByUsername(username) == null) {
////                //            DaoFactory.getUsersDao().insert(user);
////                //            response.sendRedirect("/login");
////                //        } else {
////                //            request.getSession().setAttribute("registrationError", "error");
////                //            response.sendRedirect("/register");
////                //        }
////
////        DaoFactory.getUsersDao().insert(user);
////        request.getSession().setAttribute("user",user);
////        response.sendRedirect("/login");
////
////    }
////
////
////
////    }
////
////
//
//
//
//
