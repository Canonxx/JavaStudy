package 复习题代码;

import java.util.Scanner;

public class 程序清单0312 {
	public static void main(String[] args) {
		
		int truthNumber = (int)(Math.random()*100); 
		System.out.print("Enter an integer from 0-99:");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int truthNumberBit1 = truthNumber %10;
		int truthNumberBit2 = truthNumber/10%10;
		int guessBit1 = guess%10;
		int guessBit2 = guess/10%10;
		if(guess==truthNumber ) {
			System.out.println("恭喜这个B中奖10000元");
		}
		else if(truthNumberBit1 == guessBit2 && truthNumberBit2 == guessBit1 ) {
			System.out.println("恭喜这个B中奖5000元");
		}
		else if(truthNumberBit1==guessBit1 || truthNumberBit1==guessBit2 
				|| truthNumberBit2 == guessBit1 || truthNumberBit2 == guessBit2) {
			System.out.println("恭喜这个B中奖3000元");
		}
		else {
			System.out.println("您未中奖");
		}
		input.close();
	}
}
