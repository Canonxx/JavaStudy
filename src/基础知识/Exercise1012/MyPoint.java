package »ù´¡ÖªÊ¶.Exercise1012;

public class MyPoint {
	private double x,y;
	public MyPoint(double x,double y) {
		// TODO Auto-generated constructor stub
		this.setX(x);this.setY(y);
	}
	public MyPoint() {
		this.x=0;this.y=0;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	public double distance(double x,double y) {
		
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	
}
