package UnitFour;

public class questionNine {
	//һ��쳲�����������������1,1,2,3,5,8,13,21,34�ȵ���ɵģ�����ÿһ�����飨�ӵ����������𣩶���ǰ�������ֵĺ͡�����һ������������һ���������������ʾ�ӵ�һ��Ԫ�ؿ�ʼ�ܹ��ɸò���ָ���ĸ��������ɵ�����쳲��������֡�
	//���磺�������java Fibonacci 5 ������Fibonacci������������ô�����Ӧ����1,1,2,3,5
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
