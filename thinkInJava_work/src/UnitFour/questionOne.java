package UnitFour;

import java.util.Random;

public class questionOne {
	
	public static void main(String[] args) {
		//дһ�����򣬴�ӡ��1��100��ֵ
		for(int i=0;i<100;i++) {
			System.out.print(i+1+" ");
		}
		System.out.println();
		//дһ�����򣬲���25��int���͵������������ÿһ�����ֵ��ʹ��if-else������������Ϊ���ڡ�С�ڡ�����ڽ�����������ɵ�ֵ��
//		Random rand = new Random();
//		int number = rand.nextInt(100);
//		System.out.println("��1���������"+number);
//		for(int i=2;i<=25;i++) {
//			int nextNumber = rand.nextInt(100);
//			String result;
//			if(number<nextNumber) {
//				result = "����";
//			}else if(number==nextNumber) {
//				result = "����";
//			}else {
//				result = "С��";
//			}
//			System.out.println("��"+i+"�������"+nextNumber+result+"ǰһ��");
//			number = nextNumber;
//		}
		
		//�޸���ϰ�����Ѵ�����һ��while����ѭ������������Ȼ��������ֱ���ü����ж�������
		Random rand = new Random();
		int number = rand.nextInt(100);
		System.out.println("��1���������"+number);
		int i =2;
		while(true){	
			int nextNumber = rand.nextInt(100);
			String result;
			if(number<nextNumber) {
				result = "����";
			}else if(number==nextNumber) {
				result = "����";
			}else {
				result = "С��";
			}
			System.out.println("��"+i+"�������"+nextNumber+result+"ǰһ��");
			number = nextNumber;
			i++;
		}
	}
}
