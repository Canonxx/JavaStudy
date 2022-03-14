package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0205 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate:");
		double dollars = input.nextDouble();
		double rates = input.nextDouble()/100;
		double gratuity = dollars * rates ;
		double total = dollars + gratuity ;
		System.out.println("The gratuity is $"+gratuity +" 10and total is $"+total);
		input.close();
	}
};
