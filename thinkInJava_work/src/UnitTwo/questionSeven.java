package UnitTwo;

import java.util.Random;

public class questionSeven {
	//��дһ������ģ����Ӳ�ҵĽ��
	//��1-10000֮������������������ʾ���棬ż����ʾ����
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10000) + 1;
		System.out.println(num);
		if(num % 2==0)
			System.out.println("Ӳ�ҷ���");//Ϊż��
		else
			System.out.println("Ӳ������");//Ϊ����
	}
}
