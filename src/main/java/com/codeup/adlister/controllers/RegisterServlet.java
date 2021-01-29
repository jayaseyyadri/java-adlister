package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/users/register.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("userName");
        String password = request.getParameter("Password");
        String email =request.getParameter("email");

        // TODO: ensure the submitted information is valid

        // TODO: create a new user based off of the submitted information

    User newUser = new User(
            name,
            password,
            email
    );

        DaoFactory.getUserDao().insert(newUser);
        HttpSession session = request.getSession();
        session.setAttribute("user",newUser);
        response.sendRedirect("/profile");
}

        // TODO: if a user was successfully created, send them to their profile


    }

