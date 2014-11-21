package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 
 * @author CYwlDXS
 * 连接orcl
 */
public class jdbc {
	private static Connection conn = null;
	private static String url;
	private static String user;
	private static String passworddb;

	public static Connection jdbc() throws ClassNotFoundException {
		// 装载并注册oracle数据库的jdbc驱动程序
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			java.sql.DriverManager
					.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (java.sql.SQLException e) {
			throw new RuntimeException("error");
		}

		// 建立与数据库的连接
		url = "jdbc:oracle:thin:@localhost:1521:orcl";
		// 端口号1521可以通过查看oracle安装目录下E:\oracle\product\10.2.0\db_1\NETWORK\ADMIN的listener.ora文件得知
		user = "system";
		passworddb = "931024myd";
		try {
			conn = DriverManager.getConnection(url, user, passworddb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
