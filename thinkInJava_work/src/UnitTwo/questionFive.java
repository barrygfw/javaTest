package UnitTwo;

class Dog{
	String name;
	String says;
}
public class questionFive {
	//����һ����ΪDog���࣬����������String��name��says����main()�����У���������Dog����һ����Ϊspot�����Ľ���Ϊ��Ruff����������һ����Ϊscruffy�����Ľ���Ϊ��Wurf��������Ȼ����ʾ���ǵ����ֺͽ�����
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.name = "spot";
		spot.says = "Ruff!";
		Dog scruffy = new Dog();
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
		System.out.println("my name is "+spot.name+" my says :"+spot.says);
		System.out.println("my name is "+scruffy.name+" my says :"+scruffy.says);
	//����ϰ��Ļ����ϣ�����һ���µ�Dog�����������丳ֵΪspot���󡣲�����==��equals()�������Ƚ��������õĽ����
		Dog spot1 = spot;
		System.out.println("spot��spot1��name��"+spot.name==spot1.name);
		System.out.println("spot��spot1��says��"+spot.says==spot1.says);
		System.out.println("spot��spot1��"+spot==spot1);
	}
}
