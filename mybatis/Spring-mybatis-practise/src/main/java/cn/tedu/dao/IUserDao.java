package cn.tedu.dao;

import java.util.List;

import cn.tedu.bean.User;

public interface IUserDao {
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer id);
	public void selectById(Integer id);
	public List<User> selectAll();

}
