package UnitFour;

import java.util.Arrays;

public class questionTen {
	//��Ѫ��������ָλ��Ϊż�������֣�������һ��������˶��õ�����������ָ������˻���һ��λ�������֣����д������������ѡȡ�����ֿ�����������������0��β�������ǲ������
	//���磺���м������ֶ��ǡ���Ѫ�����֣�
	//  1260=21*60
	//	1827=21*87
	//	2187=27*81
	//дһ�������ҳ�4λ����������Ѫ������
	
	public static void main(String[] args) {
		for(int i=10;i<100;i++) {
			out:
			for(int j=i+1;j<100;j++) {
				int res = i*j;
				if(res%100==0)//��β�������ֲ���Ϊ0
					continue;
				if(res>9999 || res<1000)//��λ��
					continue;
				String str1 = ""+res;//���
				String str2 = ""+i+j;//����
				char[] result = str1.toCharArray();
				char[] multplir = str2.toCharArray();
				Arrays.sort(result);
				Arrays.sort(multplir);//����
				for(int k=0;k<result.length;k++) {
					if(result[k] != multplir[k])
						continue out;
				}
				System.out.println(res+"="+i+"*"+j);
			}
		}
	}
}
