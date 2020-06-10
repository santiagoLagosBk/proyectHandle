package javaguide.login.web;

import javaguide.login.database.LoginDao;
import javaguide.login.principal.LoginU;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private LoginDao loginDao;


    public void init(){
        loginDao=new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username =request.getParameter("username");
        String password=request.getParameter("password");
        LoginU loginU=new LoginU();
        loginU.setUser(username);
        loginU.setPassword(password);



        try {
            if (loginDao.validate(loginU)){

                request.setAttribute("name1",request.getParameter("username"));
                request.getRequestDispatcher("loginsuccess.jsp").forward(request,response);


            }else{
                response.sendRedirect("index.jsp");
                HttpSession session=request.getSession();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
