package 基础知识;

import java.util.Scanner;

/*
 * 位置类
 */
class Location{
	public int row,column;
	public double maxValue;
	public Location(int row,int column,double maxValue) {
		this.row=row;
		this.column=column;
		this.maxValue=maxValue;
	}
}

public class Exercise0913 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of row ,column:");
		int m=input.nextInt(),n=input.nextInt();
		double[][] a = new double[m][n];
		System.out.println("Enter the Array:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=input.nextDouble();
			}
		}
		Location l1 = locationLargest(a);
		System.out.println("The location of the largest element is "+l1.maxValue+" at ("+
							l1.row+","+l1.column+")");
		input.close();
	}
	
	public static Location locationLargest(double[][] a) {
		double maxValue=a[0][0];
		int row=0,column=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>=maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		Location lot = new Location(row,column,maxValue);
		return lot;
	}
}
