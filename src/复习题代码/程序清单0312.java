package ��ϰ�����;

import java.util.Scanner;

public class �����嵥0312 {
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
			System.out.println("��ϲ���B�н�10000Ԫ");
		}
		else if(truthNumberBit1 == guessBit2 && truthNumberBit2 == guessBit1 ) {
			System.out.println("��ϲ���B�н�5000Ԫ");
		}
		else if(truthNumberBit1==guessBit1 || truthNumberBit1==guessBit2 
				|| truthNumberBit2 == guessBit1 || truthNumberBit2 == guessBit2) {
			System.out.println("��ϲ���B�н�3000Ԫ");
		}
		else {
			System.out.println("��δ�н�");
		}
		input.close();
	}
}
