package »ù´¡ÖªÊ¶;

import java.util.Scanner;

class LinearEquation{
	private double a,b,c,d,e,f;
	public LinearEquation(int a,int b,int c,int d,int e,int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		return a*d-b*c!=0?true:false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}


public class Exercise0911 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f:");
		LinearEquation l1 = new LinearEquation(input.nextInt(),input.nextInt(),input.nextInt()
				,input.nextInt(),input.nextInt(),input.nextInt());
		if(l1.isSolvable()) {
			System.out.println(l1.getX()+"\n"+l1.getY());
		}else {
			System.out.println("The equaion has no solution.");
		}
		input.close();
	}
}
