package user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.UserDAO;
import Entity.User;


public class addUser extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		
		UserDAO dao = new UserDAO();
		User user = new User();
		
		try {
			 user.getId();
			 user.getUsername();
			 user.getPassword();
			 user.getEmail();
	        dao.Save(user);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		response.sendRedirect("list");
	}
		
	
     
}
