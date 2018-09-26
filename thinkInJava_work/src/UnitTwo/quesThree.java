package UnitTwo;

class Letter{
	float bar;
}
public class quesThree {
	//创建一个包含float域的类，并用这个类来展示方法调用时的别名机制
	
	//创建一个方法
	static void f(Letter y) {
		y.bar = 96.77f;
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.bar = 98.1217f;
		System.out.println("调用方法前，x.bar = "+x.bar);
		f(x);
		System.out.println("调用方法后，x.bar = "+x.bar);
		
		//对形参的修改影响了实参，原因就是只是传递了一个引用，就类似于c语言传递指针
	}
}
