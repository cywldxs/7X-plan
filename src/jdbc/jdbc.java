package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 
 * @author CYwlDXS
 * ����orcl
 */
public class jdbc {
	private static Connection conn = null;
	private static String url;
	private static String user;
	private static String passworddb;

	public static Connection jdbc() throws ClassNotFoundException {
		// װ�ز�ע��oracle���ݿ��jdbc��������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			java.sql.DriverManager
					.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (java.sql.SQLException e) {
			throw new RuntimeException("error");
		}

		// ���������ݿ������
		url = "jdbc:oracle:thin:@localhost:1521:orcl";
		// �˿ں�1521����ͨ���鿴oracle��װĿ¼��E:\oracle\product\10.2.0\db_1\NETWORK\ADMIN��listener.ora�ļ���֪
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
