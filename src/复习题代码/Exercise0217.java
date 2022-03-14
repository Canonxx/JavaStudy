package ¸´Ï°Ìâ´úÂë;

import java.util.Scanner;

public class Exercise0217 {
	public static void main(String[] args) {
		System.out.print("Input two integers:");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int r = input.nextInt();
		double value = m*Math.pow(r,2);
		System.out.println("m*r*r="+value);
		input.close();
	}

}
