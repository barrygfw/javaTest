package myhello;
import java.sql.*;
public class DbUtil {
	//数据库名称
	static final String dbname = "test";
	static final String url = "jdbc:mysql://localhost/" + dbname + "?characterEncoding=utf8&useSSL=true";
	//连接数据库用户名
	static final String user = "root";
	//连接数据库密码
	static final String pass = "barry.967";
	public static void main(String[] args) throws Exception{
			//加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//获得连接
			Connection conn = DriverManager.getConnection(url,user,pass);
			//操作数据库
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("select name,grade from student");
			//如果有数据，res.next()返回true
			while(res.next()) {
				System.out.println(res.getString("name")+" 成绩: "+res.getDouble("grade"));
			}
	}
}
