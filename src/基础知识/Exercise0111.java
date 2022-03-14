package 基础知识;

import java.util.Scanner;

// 每7秒一个人诞生，
// 没13秒一个人死亡；
// 没45s有一个移民迁入
//import java.util.Scanner;

public class Exercise0111 {
	public static void main(String[] args) {
		 int integer = 7*13*45;
		 int add_peopel = 45 + 7 -13;
		 double  add_peopel_years = (365.0*24*3600/integer)*add_peopel ;
		 double after_years = 312032486 + 5*add_peopel_years ;
		 System.out.println(after_years);
		 Scanner input = new Scanner(System.in);
		 double radius = input.nextDouble();
		 System.out.println(radius);
		 input.close();
	}
}
