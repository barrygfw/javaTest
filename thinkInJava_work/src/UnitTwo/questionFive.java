package UnitTwo;

class Dog{
	String name;
	String says;
}
public class questionFive {
	//创建一个名为Dog的类，它包含两个String域：name和says。在main()方法中，创建两个Dog对象，一个名为spot（它的叫声为“Ruff！”），另一个名为scruffy（它的叫声为“Wurf！”）。然后显示他们的名字和叫声。
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.name = "spot";
		spot.says = "Ruff!";
		Dog scruffy = new Dog();
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
		System.out.println("my name is "+spot.name+" my says :"+spot.says);
		System.out.println("my name is "+scruffy.name+" my says :"+scruffy.says);
	//在练习五的基础上，创建一个新的Dog索引，并对其赋值为spot对象。测试用==和equals()方法来比较所有引用的结果。
		Dog spot1 = spot;
		System.out.print("spot和spot1的name用==判断：");System.out.println(spot.name==spot1.name);
		System.out.print("spot和spot1的says用==判断：");System.out.println(spot.says==spot1.says);
		System.out.print("spot和spot1用==判断：");System.out.println(spot==spot1);			//报错
		System.out.print("spot和spot1用equals判断：");System.out.println(spot.equals(spot1));
		System.out.print("spot和spot1的name用equals判断：");System.out.println(spot.name.equals(spot1.name));
		System.out.print("spot和spot1的says用equals判断：");System.out.println(spot.says.equals(spot1.says));
	}
}
