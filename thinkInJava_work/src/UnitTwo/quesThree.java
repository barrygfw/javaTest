package UnitTwo;

class Letter{
	float bar;
}
public class quesThree {
	//����һ������float����࣬�����������չʾ��������ʱ�ı�������
	
	//����һ������
	static void f(Letter y) {
		y.bar = 96.77f;
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.bar = 98.1217f;
		System.out.println("���÷���ǰ��x.bar = "+x.bar);
		f(x);
		System.out.println("���÷�����x.bar = "+x.bar);
		
		//���βε��޸�Ӱ����ʵ�Σ�ԭ�����ֻ�Ǵ�����һ�����ã���������c���Դ���ָ��
	}
}
