package javaguide.registration.controller;

import javaguide.registration.dao.EmplyDao;
import javaguide.registration.model.Employ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EmployServlet")


public class EmployServlet extends HttpServlet {
    EmplyDao dao=new EmplyDao();
    Employ employ=new Employ();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user=request.getParameter("userTxt");
        String pass=request.getParameter("passTxt");
        String name=request.getParameter("nameTxt");
        String lastName=request.getParameter("lastNameTxt");
        String document=request.getParameter("docTxt");

        if (user.length()<5||pass.length()<8){

            request.getRequestDispatcher("registrar.jsp").forward(request,response);
        }else{

            employ.setUser(user);
            employ.setPassword(pass);
            employ.setName(name);
            employ.setDocumento(document);
            employ.setLastName(lastName);

            dao.registerEmploy(employ);

            request.getRequestDispatcher("index.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
