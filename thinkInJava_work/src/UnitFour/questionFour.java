package UnitFour;

public class questionFour {
	public static void main(String[] args) {
		//дһ������ʹ������Ƕ�׵�forѭ����ȡ���������%����̽��ʹ�ӡ������ֻ�ܱ��������1�����������ܱ�����������������������
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
		System.out.println("\n��"+count+"��");
		
		
	}
}
