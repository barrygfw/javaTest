package UnitFour;

public class questionNine {
	//一个斐波那契数列是由数字1,1,2,3,5,8,13,21,34等等组成的，其中每一个数组（从第三个数字起）都是前两个数字的和。创建一个方法，接受一个整体参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
	//例如：如果运行java Fibonacci 5 （其中Fibonacci是类名），那么输出就应该是1,1,2,3,5
	int f(int x) {
		if(x==1||x==2)
			return 1;
		else
			return f(x-1)+f(x-2);
	}
	void Fibonacci(int m) {
		String res = new String("");
		for(int i=1;i<=m;i++) {
			res += f(i)+" ";
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		questionNine nine = new questionNine();
		nine.Fibonacci(5);
	}
}
