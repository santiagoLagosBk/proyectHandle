package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.employ;
import dao.employDao;

/**
 * Servlet implementation class loginUsers
 */
@WebServlet("/loginUsers")
public class loginUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		employDao dao=new employDao();
		String user=request.getParameter("userName");
		String pass=request.getParameter("userPass");
		
		employ employess=new employ(user,pass);
		
		if(dao.validar(employess)) {
			
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("employees.jsp");
			requestDispatcher.forward(request, response);
		}else {
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("register.jsp");
			requestDispatcher.forward(request, response);
		}
		
		
		
	}

}
