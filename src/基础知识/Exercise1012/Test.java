package 基础知识.Exercise1012;

public class Test {
	public static void  main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(0,0),new MyPoint(0,4),new MyPoint(3,0));
		System.out.println("周长："+t1.getPerimeter()+" "+"面积："+t1.getArea());
		System.out.println(t1.contains(new MyPoint(1,1)));
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2,0.3), new MyPoint(1,1), new MyPoint(1,0.5))));
		System.out.println(t1.overlaps(t1));
	}
}
