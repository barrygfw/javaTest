package UnitTwo;

import java.util.Random;

public class questionSeven {
	//编写一个程序，模拟扔硬币的结果
	//在1-10000之间产生随机数，奇数表示正面，偶数表示反面
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10000) + 1;
		System.out.println(num);
		if(num % 2==0)
			System.out.println("硬币反面");//为偶数
		else
			System.out.println("硬币正面");//为奇数
	}
}
