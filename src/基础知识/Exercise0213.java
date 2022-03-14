package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0213 {
	public static void main(String[] args) {
		System.out.print("Enter the monthly saving money:");
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		double afterMoney = money * Math.pow( 1.00417 , 6);
		System.out.println("After six month the money is "+afterMoney );
		input.close();	
			
	}
}
