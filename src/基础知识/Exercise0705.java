package 基础知识;

import java.util.Scanner;

/*打印不同的数
 * 
 * 
 * 
 */
public class Exercise0705 {
	public static void main(String[] args) {
		System.out.println("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		for(int i=0;i<array1.length;i++) {
			array1[i] = input.nextInt();
		}
		for(int i:array1) {
			System.out.print(i);
		}
		System.out.println('\n');
		array2 = setArray(array1, array2);
		for(int i:array2) {
			if(i!=0) {
				System.out.print(i);
			}
		}
		System.out.println('\n');
		input.close();
	}
	
	public static int[] setArray(int[] a,int[] b) {
		int index = 0;
		for(int i:a) {
			int count = 0 ;
			for(int j:b) {
				if(i==j) {
					count++;
				}
			}
			if(count==0) {
				b[index] = i;
				index++;
			}
		}
		return b;
	}
}
