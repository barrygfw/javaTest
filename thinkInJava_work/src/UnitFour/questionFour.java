package UnitFour;

public class questionFour {
	public static void main(String[] args) {
		//写一个程序，使用两个嵌套的for循环和取余操作符（%）来探测和打印素数（只能背其自身和1整除，而不能被其他数字整除的整数）。
		int right=100,count=1;
		System.out.print("1 ");
		out:
		for(int i=3;i<=right;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0)
					continue out;
			}
			count++;
			System.out.print(i+" ");
		}
		System.out.println("\n共"+count+"个");
		
		
	}
}
