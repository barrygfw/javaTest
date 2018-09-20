package jdbc.dao;
import java.util.List;
import jdbc.domain.Student;
public interface IStudentDao {
	//1.新增数据
	void add(Student stu);
	//2.修改指定学生信息
	void update(Student stu);
	//3.删除学生
	void delete(int id);
	//4.获取指定学生
	Student get(int id);
	//5.获取所有的学生
	List<Student> getAll();
}
