package test;
import DAO.UserDAO;
import Entity.User;

public class Test {
	public static void main(String[] args) {
//		DBUtils d = new DBUtils();
//		System.out.println(d);
		UserDAO dao = new UserDAO();
		User user = new User();
		user.setUsername("Giving");
		user.setPassword("Test");
		user.setEmail("123@163.com");
		dao.Save(user);
	
	}

}
