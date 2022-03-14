package 基础知识;

/*
 * 交点
 */

public class Exercise0912 {
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(0, 1);
		Point p4 = new Point(1, 0);
		int a,b,c,d,e,f;
		a = p1.y-p2.y;
		b = -p1.x+p2.x;
		c = p3.y-p4.y;
		d = -p3.x+p4.x;
		e = (p1.y-p2.y)*p1.x-(p1.x-p2.x)*p1.y;
		f = (p3.y-p4.y)*p3.x-(p3.x-p4.x)*p3.y;
		LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);
		if(l1.isSolvable()) {
			System.out.println("交点为：("+l1.getX()+","+l1.getY()+")");
		}else {
			System.out.println("The equaion has no solution.");
		}
	}
	
}


