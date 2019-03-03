package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.User;
import utils.DBUtils;
public class UserDAO {
	//���û���Ϣ���뵽���ݿ�
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
		} finally { //�ر���Դ
			DBUtils.close(rs, stat, conn);
		}
		
	}
	//ɾ���û��б�
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
	//��ѯ�û��б�
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
		    	//ȡ������
		    	int id = rs.getInt("id");
		    	String username = rs.getString("username");
		    	String password = rs.getString("password");
		    	String email = rs.getString("email");
		    	//�����ݷ���User��
		    	User user = new User();
		    	user.setId(id);
		    	user.setUsername(username);
		    	user.setPassword(password);
		    	user.setEmail(email);
		    	//��User�����е����ݶ���ӵ�list�����С�
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
	//��¼��֤��ѯ
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
				//�����еĲ������õ���������
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(name);
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ϵͳ��æ�����Ժ�����");
		}
		return null;
		
	}


}
