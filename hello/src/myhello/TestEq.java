package myhello;

public class TestEq {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c = "ab";
		String c1 = a+b;
		System.out.println(c1);
		if(c==c1)
			System.out.println("==");
		else
			System.out.println("!=");
	}
}
