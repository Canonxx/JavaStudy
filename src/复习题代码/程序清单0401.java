package 复习题代码;

import java.util.Scanner;

//计算三角形面积
//先判断是否三点在一条直线上；
//求出其中一个角度
public class 程序清单0401 {
	public static void main(String[] args) {
		System.out.println("输入三角形的三个顶点坐标：");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		double a = Math.pow(Math.abs(x1-x)*Math.abs(x1-x)+
				Math.abs(y1-y)*Math.abs(y1-y),0.5);
		double b = Math.pow(Math.abs(x2-x)*Math.abs(x2-x)+
				Math.abs(y2-y)*Math.abs(y2-y),0.5);
		double c = Math.pow(Math.abs(x2-x1)*Math.abs(x2-x1)+
				Math.abs(y2-y1)*Math.abs(y2-y1),0.5);
		double square;
		if((x1-x)*(y2-y)==(x2-x)*(y1-y)) {
			System.out.println("三点在一条直线上");
		}
		else {
			square = 0.5*a*b*Math.sin(Math.acos((a*a+b*b-c*c)/2*a*b));
			System.out.println("三角形的面积为："+square);
		}
		input.close();
	}
}
