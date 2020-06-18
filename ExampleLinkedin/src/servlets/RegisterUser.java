package servlets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import dao.AplicationDao;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageString=getHttmlString(request.getServletContext().getRealPath("register.jsp"),"");
		response.getWriter().write(pageString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//fill it up in a User bean
		String username=request.getParameter("username");
		String password=request.getParameter("userpass");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("LastName");
		
		User user=new User(password,username,firstName,lastName);
		AplicationDao dao=new AplicationDao();
		
		int rows=dao.registerUser(user);
		String infoMessege=null;
		if(rows!=0) {
			
			infoMessege="user registered successfully";
			
		}else {
			infoMessege="sorry, an error accurred¡ the user has alerady registered please try again";
		}
		
		String pageString=getHttmlString(request.getServletContext().getRealPath("register.jsp"), infoMessege);
		response.getWriter().write(pageString);
	}
	
	
	
	public String getHttmlString(String filepath,String messsge) throws IOException{
		
		BufferedReader reader=new BufferedReader(new FileReader(filepath));
		String line="";
		StringBuffer buffer=new StringBuffer();
		while((line=reader.readLine())!=null){
			
			buffer.append(line);
		}
		reader.close();
		
		String page=buffer.toString();
		page=MessageFormat.format(page,messsge );
		
		return page;
	}

}
