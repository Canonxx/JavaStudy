package 基础知识;

import java.util.Scanner;

public class Exercise0206 {
	public static void main(String[] args) {
		System.out.print("Enter an integer between 0 and 1000:");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		int a = integer % 10;
		int b = integer /10 % 10;
		int c = integer /10 /10%10;
		int sum = a+b+c;
		System.out.println(integer +"的所有位数相加为："+sum );
		input.close();
	}
}
