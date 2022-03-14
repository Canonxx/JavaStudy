package 基础知识;

import java.util.Scanner;

public class Exercise0321 {
	public static void main(String[] args) {
		System.out.print("Enter year,month,the day of the month:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		int q = day;
		int m = (month>2)?month:12+month ;
		int j = year/100;
		int k = year%100;
		int h = (q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		switch (h){
		case 0:
			System.out.println("星期六");
			break;
		case 1:
			System.out.println("星期天");
			break;
		case 2:
			System.out.println("星期一");
			break;
		case 3:
			System.out.println("星期二");
			break;
		case 4:
			System.out.println("星期三");
			break;
		case 5:
			System.out.println("星期四");
			break;
		case 6:
			System.out.println("星期五");
			break;
		}
		input.close();
	}
}
