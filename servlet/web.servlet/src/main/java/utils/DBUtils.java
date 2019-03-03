package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import com.sun.org.apache.xml.internal.security.Init;

public class DBUtils {
	private static String driver;
	private static String username;
	private static String url;
	private static String password;
	private static BasicDataSource dataSource;
	static{
		Properties prop = new Properties();
		InputStream ips = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {//读取数据库信息
			prop.load(ips);
			driver = prop.getProperty("driver");
			username=prop.getProperty("username");
			url = prop.getProperty("url");
			password = prop.getProperty("password");
		    String initSize = prop.getProperty("initSize");
		    String maxSize  = prop.getProperty("maxSize");
			  
			//创建数据库连接池配置信息，并连接数据库
			dataSource = new BasicDataSource();
			dataSource.getDriverClassName();
			dataSource.getUsername();
			dataSource.getUrl();
		    dataSource.getPassword();
		    dataSource.setInitialSize(Integer.parseInt(initSize));
		    dataSource.setMaxActive(Integer.parseInt(maxSize));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws SQLException{
		return dataSource.getConnection();
		
	}
	public static void close(ResultSet rs,Statement stat,Connection conn){
		try {
			if (rs!=null) {
				rs.close();
			}
			if (stat!=null) {
				stat.close();
			}
			if (conn!=null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
