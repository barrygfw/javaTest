package jdbc.dao.impl;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import jdbc.dao.IStudentDao;
import jdbc.domain.Student;
import jdbc.util.Db;
public class StudentDaoImpl implements IStudentDao{

	public void add(Student stu) {
		//新增
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//连接
			conn = Db.getConn();
			//创建语句
			String sql = "insert into student(name,sex,grade) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getName());
			ps.setString(2, stu.getSex());
			ps.setDouble(3, stu.getGrade());
			//执行语句
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			Db.close(conn, ps, null);
		}
	}

	public void update(Student stu) {
		// 更新
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//连接
			conn = Db.getConn();
			//创建语句
			String sql = "update student set name=?,grade=?,sex=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getName());
			ps.setDouble(2, stu.getGrade());
			ps.setString(3, stu.getSex());
			ps.setInt(4, stu.getId());
			//执行语句
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			Db.close(conn, ps, null);
		}
	}

	public void delete(int id) {
		// 删除
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//连接
			conn = Db.getConn();
			//创建语句
			String sql = "delete from student where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			//执行语句
			ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			Db.close(conn,ps,null);
		}
	}

	public Student get(int id) {
		// 获得一条数据
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			//连接
			conn = Db.getConn();
			//创建语句
			String sql = "select * from student where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			//执行语句
			res = ps.executeQuery();
			if(res.next()) {
				Student stu = new Student();
				stu.setName(res.getString("name"));
				stu.setSex(res.getString("sex"));
				stu.setGrade(res.getDouble("grade"));
				return stu;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			Db.close(conn, ps, res);
		}
		return null;
	}

	public List<Student> getAll() {
		// 获得所有数据
		Connection conn = null;
		Statement sta = null;
		ResultSet res = null;
		try {
			//连接
			conn = Db.getConn();
			//创建语句
			sta = conn.createStatement();
			String sql = "select * from student";
			//执行语句
			res = sta.executeQuery(sql);
			List<Student> list = new ArrayList<Student>();
			while(res.next()) {
				Student stu = new Student();
				stu.setName(res.getString("name"));
				stu.setSex(res.getString("sex"));
				stu.setGrade(res.getDouble("grade"));
				stu.setId(res.getInt("id"));
				list.add(stu);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			Db.close(conn, sta, res);
		}
		return null;
	}
	
}
