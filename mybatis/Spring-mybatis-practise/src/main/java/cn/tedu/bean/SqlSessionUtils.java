package cn.tedu.bean;
//对重复部分封装
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.tedu.dao.UserDao;

public class SqlSessionUtils {
	private static SqlSessionFactory ssf;
	//该方法只被执行一次
	static{
		InputStream ips = UserDao.class.getClassLoader().getResourceAsStream("SqlMapperConfig.xml");
		ssf = new SqlSessionFactoryBuilder().build(ips);
		
		
	}
	public static SqlSession getSession(){
		return ssf.openSession();
	}

}
