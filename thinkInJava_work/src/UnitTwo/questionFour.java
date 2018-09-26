package UnitTwo;

public class questionFour {
	//编写一个计算速度的程序，它所使用的距离和时间都是常量
	
	public static float x = 350.5f;	//距离 单位：米
	public static float s = 30.88f;	//时间 单位：秒
	
	public static void main(String[] args) {
		float v;	//速度 单位：米/秒
		v = x/s;
		System.out.println("速度为："+v+" m/s");
	}
}
