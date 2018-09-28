package UnitFour;

import java.util.Arrays;

public class questionTen {
	//吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，其中从最初的数字中选取的数字可以任意排序，以两个0结尾的数字是不允许的
	//例如：下列几个数字都是“吸血鬼”数字：
	//  1260=21*60
	//	1827=21*87
	//	2187=27*81
	//写一个程序，找出4位数的所有吸血鬼数字
	
	public static void main(String[] args) {
		for(int i=10;i<100;i++) {
			out:
			for(int j=i+1;j<100;j++) {
				int res = i*j;
				if(res%100==0)//结尾两个数字不能为0
					continue;
				if(res>9999 || res<1000)//四位数
					continue;
				String str1 = ""+res;//结果
				String str2 = ""+i+j;//乘数
				char[] result = str1.toCharArray();
				char[] multplir = str2.toCharArray();
				Arrays.sort(result);
				Arrays.sort(multplir);//排序
				for(int k=0;k<result.length;k++) {
					if(result[k] != multplir[k])
						continue out;
				}
				System.out.println(res+"="+i+"*"+j);
			}
		}
	}
}
