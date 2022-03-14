package »ù´¡ÖªÊ¶;

import java.util.Scanner;

/*Ã°ÅİÅÅĞò
 * 
 * 
 * 
 */
public class Exercise0718 {
	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
		}
		input.close();
		System.out.println("The sorted array is:");
		bubbleSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
	
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=array.length-1;j>i;j--) {
			int temp;
			if(array[j]<array[j-1]) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
			}
		}
	}
}
