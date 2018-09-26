package UnitTwo;

class demo{
	float floatnum;
}
public class questionTwo {
	//创建一个包含一个float域的类，并用这个类来展示别名机制
	
	//别名机制：实例化两个相同的对象，并对里面的属性赋不同的值，然后将其中一个对象赋值给另一个，修改其中一个对象内属性的值，另一个随之改变，这种特殊的现象成为别名现象
	
	public static void main(String[] args) {
		demo float1 = new demo();
		demo float2 = new demo();
		float1.floatnum = 96.77f;		//float单精度后面需加f，double为双精度不需加
		float2.floatnum = 98.1217f;
		System.out.println("float1.floatnum = "+float1.floatnum);
		System.out.println("float2.floatnum = "+float2.floatnum);
		float1 = float2;
		System.out.println("两对象赋值后的值");
		System.out.println("float1.floatnum = "+float1.floatnum);
		System.out.println("float2.floatnum = "+float2.floatnum);
		//修改其中一个
		float1.floatnum = 97.777f;
		System.out.println("修改其中一个后的值");
		System.out.println("float1.floatnum = "+float1.floatnum);
		System.out.println("float2.floatnum = "+float2.floatnum);
	}
	
	//解释：赋值操作是一个对象的引用，实例化后，两个对象对应不同的引用，赋值时，被赋值的引用被覆盖，那个不再被引用的对象会被垃圾回收器回收，这两个对象指向的是同一个引用，故值会随之改变
}
