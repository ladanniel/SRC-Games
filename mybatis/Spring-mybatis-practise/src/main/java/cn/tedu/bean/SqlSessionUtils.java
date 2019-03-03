package cn.tedu.bean;
//���ظ����ַ�װ
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.tedu.dao.UserDao;

public class SqlSessionUtils {
	private static SqlSessionFactory ssf;
	//�÷���ֻ��ִ��һ��
	static{
		InputStream ips = UserDao.class.getClassLoader().getResourceAsStream("SqlMapperConfig.xml");
		ssf = new SqlSessionFactoryBuilder().build(ips);
		
		
	}
	public static SqlSession getSession(){
		return ssf.openSession();
	}

}
