package jdbc.domain;

public class Student {
	int id;
	String name;
	double grade;
	String sex;
	//获取id
	public int getId() {
		return id;
	}
	//设置id
	public void setId(int id) {
		this.id = id;
	}
	//获取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String name) {
		this.name = name;
	}
	//获取成绩
	public double getGrade() {
		return grade;
	}
	//设置成绩
	public void setGrade(double grade) {
		this.grade = grade;
	}
	//获取性别
	public String getSex() {
		return sex;
	}
	//设置性别
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
