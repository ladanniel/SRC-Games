package web;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import DAO.UserDAO;
import entity.User;


public class CatcheListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		
		UserDAO dao = new UserDAO();
		
		try {
			List<User> users = dao.findall();
			ServletContext stc = arg0.getServletContext();
				stc.setAttribute("users",users);
				
				System.out.println("contextInitialized÷¥––");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
