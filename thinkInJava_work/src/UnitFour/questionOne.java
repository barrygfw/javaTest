package UnitFour;

import java.util.Random;

public class questionOne {
	
	public static void main(String[] args) {
		//写一个程序，打印从1到100的值
		for(int i=0;i<100;i++) {
			System.out.print(i+1+" ");
		}
		System.out.println();
		//写一个程序，产生25个int类型的随机数。对于每一个随机值，使用if-else语句来将其分类为大于、小于、或等于紧随他随机生成的值。
//		Random rand = new Random();
//		int number = rand.nextInt(100);
//		System.out.println("第1个随机数："+number);
//		for(int i=2;i<=25;i++) {
//			int nextNumber = rand.nextInt(100);
//			String result;
//			if(number<nextNumber) {
//				result = "大于";
//			}else if(number==nextNumber) {
//				result = "等于";
//			}else {
//				result = "小于";
//			}
//			System.out.println("第"+i+"个随机数"+nextNumber+result+"前一个");
//			number = nextNumber;
//		}
		
		//修改练习二，把代码用一个while无限循环包括起来，然后运行他直至用键盘中断其运行
		Random rand = new Random();
		int number = rand.nextInt(100);
		System.out.println("第1个随机数："+number);
		int i =2;
		while(true){	
			int nextNumber = rand.nextInt(100);
			String result;
			if(number<nextNumber) {
				result = "大于";
			}else if(number==nextNumber) {
				result = "等于";
			}else {
				result = "小于";
			}
			System.out.println("第"+i+"个随机数"+nextNumber+result+"前一个");
			number = nextNumber;
			i++;
		}
	}
}
