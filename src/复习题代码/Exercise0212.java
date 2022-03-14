package 复习题代码;

import java.util.Scanner;

//假设今天星期二，n天后星期几
public class Exercise0212 {
	public static void main(String[] args) {
		System.out.print("Input the days:");
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		int  nDays = (2+days)%7;
		System.out.print(days +"天后是星期"+ nDays );	
		input.close();
	}

}
