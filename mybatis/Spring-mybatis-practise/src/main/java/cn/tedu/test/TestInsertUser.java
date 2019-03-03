package cn.tedu.test;



import org.junit.Test;

import cn.tedu.bean.User;
import cn.tedu.dao.IUserDao;
import cn.tedu.dao.UserDao;

public class TestInsertUser {
	@Test
	public void testInsertUser(){
		UserDao dao = new UserDao();
		User user = new User();
		user.setUsername("¹ØÓð");
		user.setPassword("123456789");
		user.setPhone("18788113135");
		user.setEmail("tedu@qq.cn");
		dao.insertUser(user);
	}
     @Test
	public void testUpdateUser(){
		UserDao dao = new UserDao();
		User user = new User();
		user.setId(4);
		user.setUsername("ÌÆÈý²Ø");
		user.setPassword("0005");
		user.setPhone("1361961726");
		user.setEmail("tedu@136.com");
		dao.updateUser(user);
	}
	@Test
	public void testDeleteUser(){
		UserDao dao = new UserDao();
		dao.deleteUser(4);
		
	}
	@Test
	public void testSelectUser(){
		IUserDao dao = new UserDao();
		dao.selectById(1);
	}

}
