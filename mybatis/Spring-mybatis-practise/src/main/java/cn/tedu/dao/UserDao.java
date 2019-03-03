package cn.tedu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.tedu.bean.SqlSessionUtils;
import cn.tedu.bean.User;

public class UserDao implements IUserDao{

	public void insertUser(User user) {
		//�����ظ������Է�װ
//		InputStream ips = UserDao.class.getClassLoader().getResourceAsStream("SqlMapperConfig.xml");
//		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(ips);
//		SqlSession session = ssf.openSession();//����session��������ϵ��Ự��
		SqlSession session = SqlSessionUtils.getSession();
		session.insert("userDao.insertUser",user);
		session.commit();
		session.close();
	}

	public void updateUser(User user) {
		SqlSession session = SqlSessionUtils.getSession();
		session.update("userDao.updateUser",user);
		session.commit();
		session.close();
	}

	public void deleteUser(Integer id) {
		SqlSession session = SqlSessionUtils.getSession();
		session.delete("userDao.deleteUser",id);
		session.commit();
		session.close();
		
	}

	public void selectById(Integer id) {
		SqlSession session = SqlSessionUtils.getSession();
		User user = session.selectOne("userDao.selectById",id);
		session.commit();
		session.close();
		System.out.println("user"+user);
		
		
		
	}

	public List<User> selectAll() {
		
		return null;
	}

}
