package UnitTwo;

class demo{
	float floatnum;
}
public class questionTwo {
	//����һ������һ��float����࣬�����������չʾ��������
	
	//�������ƣ�ʵ����������ͬ�Ķ��󣬲�����������Ը���ͬ��ֵ��Ȼ������һ������ֵ����һ�����޸�����һ�����������Ե�ֵ����һ����֮�ı䣬��������������Ϊ��������
	
	public static void main(String[] args) {
		demo float1 = new demo();
		demo float2 = new demo();
		float1.floatnum = 96.77f;		//float�����Ⱥ������f��doubleΪ˫���Ȳ����
		float2.floatnum = 98.1217f;
		System.out.println("float1.floatnum = "+float1.floatnum);
		System.out.println("float2.floatnum = "+float2.floatnum);
		float1 = float2;
		System.out.println("������ֵ���ֵ");
		System.out.println("float1.floatnum = "+float1.floatnum);
		System.out.println("float2.floatnum = "+float2.floatnum);
		//�޸�����һ��
		float1.floatnum = 97.777f;
		System.out.println("�޸�����һ�����ֵ");
		System.out.println("float1.floatnum = "+float1.floatnum);
		System.out.println("float2.floatnum = "+float2.floatnum);
	}
	
	//���ͣ���ֵ������һ����������ã�ʵ���������������Ӧ��ͬ�����ã���ֵʱ������ֵ�����ñ����ǣ��Ǹ����ٱ����õĶ���ᱻ�������������գ�����������ָ�����ͬһ�����ã���ֵ����֮�ı�
}
