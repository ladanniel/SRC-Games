package Test;

import java.sql.SQLException;
import java.util.List;

import DAO.UserDAO;
import entity.User;

public class TestDao {
	public static void main(String[] args) throws SQLException {
		UserDAO dao = new UserDAO();
		List<User> users = dao.findall();
		System.out.println(users);
	}

}
