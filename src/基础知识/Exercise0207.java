package 基础知识;

import java.util.Scanner;

public class Exercise0207 {
	public static void main(String[] args) {
		System.out.print("Enter the number of minutes:");
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int years = minutes / (365*24*60);
		int days = minutes %(365*24*60)/(24*60);
		System.out.println(minutes +"minutes"+" is approximately "+years+
				 "年"+"and"+days+"天");
		input.close();
	}
}
