package user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.UserDAO;
import Entity.User;

public class Delete extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=utf-8");
	
	try {
		UserDAO dao = new UserDAO();
		User u = new User();
	    int d = Integer.parseInt(request.getParameter("id"));
	    u.setId(d);
	    dao.Del(u);
			
	} catch (Exception e) {
		e.printStackTrace();
	}
	response.sendRedirect("list");
	}
     
}
