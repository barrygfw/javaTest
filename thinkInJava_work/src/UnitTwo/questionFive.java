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
		System.out.print("spot��spot1��name��==�жϣ�");System.out.println(spot.name==spot1.name);
		System.out.print("spot��spot1��says��==�жϣ�");System.out.println(spot.says==spot1.says);
		System.out.print("spot��spot1��==�жϣ�");System.out.println(spot==spot1);			//����
		System.out.print("spot��spot1��equals�жϣ�");System.out.println(spot.equals(spot1));
		System.out.print("spot��spot1��name��equals�жϣ�");System.out.println(spot.name.equals(spot1.name));
		System.out.print("spot��spot1��says��equals�жϣ�");System.out.println(spot.says.equals(spot1.says));
	}
}
