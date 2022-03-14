package 基础知识;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * 
 */
public class Exercise0622 {
	static  double ACCURACY = 0.00001;
	public static void main(String[] args) { 
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		System.out.println("n的平方根为"+sqrt(n));
		input.close();
	}
	
	public static double sqrt(double n) {
		double nextGuess = 1.0;
		double lastGuess;
		while(true) {
			lastGuess = nextGuess;
			nextGuess= (lastGuess+n/lastGuess)*0.5;
			if(Math.abs(lastGuess-nextGuess)<ACCURACY) {
				return nextGuess;
			}
		}
	}
}
