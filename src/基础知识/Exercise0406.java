package ����֪ʶ;


//��һ��Բ��������������㣻
//Ԫ�İ뾶Ϊ5
//���������㹹�ɵ������ε������
public class Exercise0406 {
	public static void main(String[] args) {
		final int RADUIS = 5;
		//��������Ƕȣ�������λ��
		double rad = Math.random()*(-2*Math.PI)+2*Math.PI;
		double x = RADUIS*Math.cos(rad);
		double y = RADUIS*Math.sin(rad);
		double rad1 = Math.random()*(-2*Math.PI)+2*Math.PI;
		double x1 = RADUIS*Math.cos(rad1);
		double y1= RADUIS*Math.sin(rad1);
		double rad2 = Math.random()*(-2*Math.PI)+2*Math.PI;
		double x2 = RADUIS*Math.cos(rad2);
		double y2= RADUIS*Math.sin(rad2);
		// �������εı߳���
		double a = Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		double b = Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
		double c = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		// �����
		double area = 0.5*a*b*Math.sin(Math.acos((a*a+b*b-c*c)/(2*a*b)));
		System.out.printf("���������Ϊ%.2f",area);
	}
}
