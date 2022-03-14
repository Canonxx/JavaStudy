package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0719 {
	public static void main(String[] args) {
		System.out.println("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
		}
		System.out.println(isSorted(array)?"The list is already sorted":
			"The list is not sorted");
		input.close();
	}
	
	public static boolean isSorted(int[] array) {
		boolean flag = true;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
