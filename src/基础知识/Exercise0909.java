package 基础知识;
/*
 * 正n边形
 */
class ReguPolygon{
	private int n; //边数,n=3
	private double side; // 边长side=1
	private double x,y; // 多边形中点坐标x=0,y=0
	
	public ReguPolygon() {
		n=3;
		side =1;
		x=0;y=0;
	}
	public ReguPolygon(int n,double side) {
		this.n = n;
		this.side = side;
		x=0;y=0;
	}
	public ReguPolygon(int n,double side,double x,double y) {
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public int getN() {
		return n;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getPerimeter() {
		return n*side;
	}
	public double getArea() {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	
}

public class Exercise0909 {
	public static void main(String[] args) {
		ReguPolygon r1 = new ReguPolygon();
		ReguPolygon r2 = new ReguPolygon(1,2);
		System.out.println(r1.getN()+"\n"+r1.getSide()+"\n"+r1.getX()+"\n"+r1.getY()+"\n"+
						   r1.getArea());
		r1.setN(4);
		r1.setSide(4.5);
		r1.setX(1);
		r1.setY(6);
		System.out.println(r1.getN()+"\n"+r1.getSide()+"\n"+r1.getX()+"\n"+r1.getY());
		System.out.println(r2.getN()+"\n"+r2.getSide()+"\n"+r2.getX()+"\n"+r2.getY());
	}
}
