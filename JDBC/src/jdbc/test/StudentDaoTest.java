package jdbc.test;

import jdbc.dao.IStudentDao;
import jdbc.dao.impl.StudentDaoImpl;
import jdbc.domain.Student;
public class StudentDaoTest {
	public static void main(String[] args) {
		IStudentDao dao = new StudentDaoImpl();
		
		//新增演示
		Student stu = new Student();
		stu.setName("lalala");
		stu.setSex("男");
		stu.setGrade(59.5);
		dao.add(stu);
		
		//更新演示
//		Student stu = new Student();
//		stu.setSex("女");
//		stu.setId(12);
//		stu.setGrade(59.5);
//		stu.setName("lalala");
//		dao.update(stu);
		
		//删除演示
		dao.delete(13);
		
		//获取单条数据演示
//		Student stu = dao.get(1);
//		System.out.println("姓名："+stu.getName()+" 性别："+stu.getSex()+" 分数："+stu.getGrade());
		
		//获取所有数据演示
//		List<Student> list = dao.getAll();
//		for(int i=0;i<list.size();i++) {
//			System.out.println("姓名："+list.get(i).getName()+" 性别："+list.get(i).getSex()+" 分数："+list.get(i).getGrade());
//		}
	}
}
