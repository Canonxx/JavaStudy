package 基础知识;

import java.util.Scanner;

public class Exercise0322 {
	public static void main(String[] args) {
		System.out.println("Enter the position of the point (x,y):");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		if((x*x+y*y)>100) {
			System.out.println("在圆外");
		}
		else {
			System.out.println("在圆内");
		}
		input.close();
		
		
		
		
		}
}
