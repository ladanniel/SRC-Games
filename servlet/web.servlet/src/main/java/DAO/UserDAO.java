package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.User;
import utils.DBUtils;
public class UserDAO {
	//将用户信息插入到数据库
	public void Save(User users){
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConn(); 
			String sql = "insert int t_user values(null,?,?,?)";
			stat = conn.prepareStatement(sql); 
			stat.setString(1, users.getUsername());
			stat.setString(2, users.getPassword());
			stat.setString(3, users.getEmail());
			stat.executeQuery();
		} catch (Exception e) {

			e.printStackTrace();
		} finally { //关闭资源
			DBUtils.close(rs, stat, conn);
		}
		
	}
	//删除用户列表
	public void Del(User user) throws Exception{
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConn();
			String sql = "delete from t_user where id=?";
			stat = conn.prepareStatement(sql);
			stat.setInt(1, user.getId());
			stat.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			DBUtils.close(rs, stat, conn);
		}
	}
	//查询用户列表
	public  List<User> findall() throws Exception{
		List<User> users = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;

		try {
			conn = DBUtils.getConn();
			String sql = "select *from t_user";
			stat = conn.prepareStatement(sql);
			rs = stat.executeQuery();
		    while(rs.next()){
		    	//取出数据
		    	int id = rs.getInt("id");
		    	String username = rs.getString("username");
		    	String password = rs.getString("password");
		    	String email = rs.getString("email");
		    	//把数据放入User中
		    	User user = new User();
		    	user.setId(id);
		    	user.setUsername(username);
		    	user.setPassword(password);
		    	user.setEmail(email);
		    	//把User中所有的数据都添加到list集合中、
		    	users.add(user);
		    }
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			DBUtils.close(rs, stat, conn);
		}
		return users;
		
	}
	//登录验证查询
	public User find(String name){
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		User user=null;
		try {
			conn = DBUtils.getConn();
			String sql = "select *from t_user where username=?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, name);
			rs=stat.executeQuery();
			while(rs.next()){
				//把所有的参数设置到参数里面
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(name);
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("系统繁忙，请稍后再试");
		}
		return null;
		
	}


}
