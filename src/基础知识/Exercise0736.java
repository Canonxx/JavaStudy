package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0736 {
	public static void main(String[] args) {
	//	System.out.println("my name is :");
		int[] array = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
		}
		input.close();
	}
}
