package 基础知识;

import java.util.Scanner;


/*两个矩阵相乘
 * 
 * 
 */
public class Exercise0806 {
	public static void main(String[] args) {
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		System.out.println("Enter matrix1:");
		Scanner input = new Scanner(System.in);
		initArray(a,input);
		System.out.println("Enter matrix2:");
		initArray(b,input);
		double[][] c = multiplyMatrix(a, b);
		showMatrix(a,b,c);
		input.close();
		
	}
	
	public static void showMatrix(double[][] matrix1,double[][] matrix2,double[][] matrix3) {
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<9;j++) {
				if(j/3==0) {
					System.out.printf("%5.1f", matrix1[i][j]);
				}
				if(j/3==1 && j%3==0 && i!=1) {
					System.out.print("     ");
				}
				if(j/3==1 && j%3==0 && i==1) {
					System.out.print("   * ");
				}
				if(j/3==1) {
					System.out.printf("%5.1f ", matrix2[i][j%3]);
				}
				if(j/3==2 && j%3==0 && i!=1) {
					System.out.print("     ");
				}
				if(j/3==2 && j%3==0 && i==1) {
					System.out.print("  =  ");
				}
				if(j/3==2 ) {
					System.out.printf("%5.1f", matrix3[i][j%3]);
				}
			}
			System.out.println();
		}
	}
	
	public static void initArray(double[][] a,Scanner input) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = input.nextDouble();
			}
		}
		//input.close();
	}
	
	public static double[][] multiplyMatrix(double[][] a,double[][] b){
		double[][] c = new double[3][3];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				for(int k=0;k<c[i].length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
}
