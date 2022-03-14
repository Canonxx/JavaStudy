package »ù´¡ÖªÊ¶.Exercise1012;

public class Triangle2D {
	private MyPoint p1 = new MyPoint();
	private MyPoint p2 = new MyPoint();
	private MyPoint p3 = new MyPoint();
	public Triangle2D() {
		// TODO Auto-generated constructor stub
		p1.setX(0);p1.setY(0);
		p2.setX(1);p1.setY(1);
		p3.setX(2);p3.setY(5);
	}
	public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public double getArea() {
		double s1 = p1.distance(p2.getX(),p2.getY());
		double s2 = p1.distance(p3.getX(), p3.getY());
		double s3 = p2.distance(p3.getX(), p3.getY());
		double s = (s1+s2+s3)/2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
	public double  getPerimeter() {
		double s1 = p1.distance(p2.getX(),p2.getY());
		double s2 = p1.distance(p3.getX(), p3.getY());
		double s3 = p2.distance(p3.getX(), p3.getY());
		return s1+s2+s3;
	}
	public boolean contains(MyPoint p1) {
		boolean flag = isSameSide(this.p1, this.p2, this.p3, p1) &&
				isSameSide(this.p2, this.p3, this.p1, p1) &&
				isSameSide(this.p3, this.p1, this.p2, p1);
		return flag;
	}
	
	private boolean isSameSide(MyPoint p1,MyPoint p2,MyPoint p3,MyPoint p0) { 
		double deltX10 = p0.getX()-p1.getX();
		double deltY10 = p0.getY()-p1.getY();
		double deltX12 = p2.getX()-p1.getX();
		double deltY12 = p2.getY()-p1.getY();
		double deltX13 = p3.getX()-p1.getX();
		double deltY13 = p3.getY()-p1.getY();
		double n1 = deltX12*deltY10-deltY12*deltX10;
		double n2 = deltX12*deltY13-deltY12*deltX13;
		return n1*n2>0?true:false;
	}
	public boolean contains(Triangle2D t) {
		return contains(t.getP1())&&contains(t.getP2())&&contains(t.getP3());
	}
	public boolean overlaps(Triangle2D t) {
		boolean flag =t.getP1().getX()==this.p1.getX()&&t.getP1().getY()==this.p1.getY()&&
				  t.getP2().getX()==this.p2.getX()&&t.getP2().getY()==this.p2.getY()&&
				  t.getP3().getX()==this.p3.getX()&&t.getP3().getY()==this.p3.getY();
		return flag;
	}
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
}
