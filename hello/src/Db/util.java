package Db;
import java.sql.*;
public class util {
	// 数据库地址
		public static String url = "jdbc:mysql://localhost:3306/test?useSSL=true";
		// 用户名
		public static String username = "root";
		// 密码
		public static String pwd = "barry.967";
		// 驱动名
		public static String driverName = "com.mysql.jdbc.Driver";
		// 1.加载驱动
		static {
			try {
				Class.forName(util.driverName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 返回连接
		public static Connection getConn() {
			try {
				// 2.连接数据库
				return DriverManager.getConnection(util.url, util.username, util.pwd);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		//关闭连接，释放资源
		public static void close(Connection conn,Statement sta,ResultSet res) {
			if(res != null) {
				try {
					res.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(sta != null) {
				try {
					sta.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
